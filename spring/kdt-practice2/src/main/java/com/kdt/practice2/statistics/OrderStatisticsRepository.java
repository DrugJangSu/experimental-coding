package com.kdt.practice2.statistics;

import com.kdt.practice2.order.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

// ─────────────────────────────────────────────────────────────
// 통계·배송 API가 DB에서 데이터를 꺼내 오는 곳
//
// JpaRepository<Order, Long>
//   → Order 엔티티를 다루고, id 타입은 Long
//   → 상속만 해도 findById, findAll, save 같은 기본 메서드가 생김
//
// 이 파일엔 두 종류의 메서드가 있어요
//   (1) @Query 있음 : 실제 동작은 따옴표 안 JPQL이 정함. 메서드 이름은 그냥 이름표
//   (2) @Query 없음 : 메서드 이름 자체가 쿼리. 스프링이 이름을 읽어서 SQL을 만듦
//
// JPQL은 SQL과 비슷하지만 "테이블·칸" 대신 "엔티티·필드" 이름을 씀
//   SQL : orders.created_at      JPQL : o.createdAt
//   SQL : order_item.line_amount JPQL : i.lineAmount
//
// :start, :end 는 값이 들어갈 자리. 아래 @Param("start")의 값이 여기로 들어감
//   → 콜론과 이름은 반드시 붙여 쓰기 (: start ✘ / :start ✔)
// ─────────────────────────────────────────────────────────────
public interface OrderStatisticsRepository extends JpaRepository<Order, Long> {

    // =========================================================
    // A17 접수일별 주문 통계 — "DB에서 세기" 방식 (메서드 4개, SQL 5번)
    // =========================================================

    // 그날 접수된 주문 수 (취소 포함 전체)
    //   count(o): 주문 개수를 셈 → 결과는 숫자 하나
    //   하루 범위: start(그날 0시) 이상, end(다음 날 0시) 미만
    @Query("select count(o) from Order o "
            + "where o.createdAt >= :start and o.createdAt < :end")
    long countOrders(@Param("start") LocalDateTime start,
                     @Param("end") LocalDateTime end);

    // 그날 접수된 주문 중 특정 상태(PLACED 또는 CANCELLED)인 것만 셈
    //   Service에서 "PLACED"로 한 번, "CANCELLED"로 한 번 부름 → SQL 2번
    @Query("select count(o) from Order o "
            + "where o.status = :status and o.createdAt >= :start and o.createdAt < :end")
    long countOrdersByStatus(@Param("status") String status,
                             @Param("start") LocalDateTime start,
                             @Param("end") LocalDateTime end);

    // PLACED 주문의 수량 합계
    //   수량(quantity)은 메뉴 줄(OrderItem)에 있어서 OrderItem에서 출발
    //   join i.order o : 메뉴 줄 → 그 줄이 속한 주문으로 따라감 (@ManyToOne 덕분)
    //   sum(...)       : 여러 줄의 수량을 하나로 더함
    //   coalesce(..., 0L): 주문이 하나도 없으면 sum이 null → 0으로 바꿔 줌
    @Query("select coalesce(sum(i.quantity), 0L) from OrderItem i join i.order o "
            + "where o.status = 'PLACED' and o.createdAt >= :start and o.createdAt < :end")
    long sumPlacedQuantity(@Param("start") LocalDateTime start,
                           @Param("end") LocalDateTime end);

    // PLACED 주문의 금액 합계 (위와 같은 구조, 더하는 칸만 lineAmount)
    @Query("select coalesce(sum(i.lineAmount), 0L) from OrderItem i join i.order o "
            + "where o.status = 'PLACED' and o.createdAt >= :start and o.createdAt < :end")
    long sumPlacedAmount(@Param("start") LocalDateTime start,
                         @Param("end") LocalDateTime end);

    // =========================================================
    // A18 접수일별 메뉴 통계 — "DB에서 세기" 방식 (SQL 1번)
    // =========================================================

    // 메뉴별로 묶어서 수량·금액 합계
    //   select new ...MenuStatistics(...) : 결과를 바로 MenuStatistics DTO로 만들어 줌
    //     → JPQL 안이라서 패키지 이름까지 전부 적어야 함
    //     → sum() 결과는 Long이라 MenuStatistics 칸도 Long이어야 함
    //   group by : 메뉴별 바구니로 나눠 담고, 바구니마다 sum
    //   where에 status = 'PLACED' : 메뉴 통계는 취소 주문을 아예 빼고 셈
    @Query("""
            select new com.kdt.practice2.statistics.MenuStatistics(
                i.menuId, i.menuName, sum(i.quantity), sum(i.lineAmount))
            from OrderItem i join i.order o
            where o.status = 'PLACED'
              and o.createdAt >= :start and o.createdAt < :end
            group by i.menuId, i.menuName
            order by i.menuId
            """)
    List<MenuStatistics> menuStatistics(@Param("start") LocalDateTime start,
                                        @Param("end") LocalDateTime end);

    // =========================================================
    // A24 접수일별 고객 통계 — "DB에서 세기" 방식 (SQL 1번)
    // =========================================================

    // 이메일별로 묶어서 주문 건수·상태별 건수·수량·금액
    //   count(distinct o.id) : 메뉴 줄 JOIN 때문에 주문이 복사되니까, 주문 번호를 중복 빼고 셈
    //   case when ... then o.id end : PLACED(또는 CANCELLED)일 때만 주문 번호, 아니면 null → 안 셈
    //   sum(case when ... else 0 end) : PLACED일 때만 수량·금액을 더함
    //   where에 status 조건이 없는 이유: 취소 건수도 세야 해서
    @Query("""
            select new com.kdt.practice2.statistics.CustomerStatistics(
                o.email,
                count(distinct o.id),
                count(distinct case when o.status = 'PLACED' then o.id end),
                count(distinct case when o.status = 'CANCELLED' then o.id end),
                sum(case when o.status = 'PLACED' then i.quantity else 0 end),
                sum(case when o.status = 'PLACED' then i.lineAmount else 0 end))
            from OrderItem i join i.order o
            where o.createdAt >= :start and o.createdAt < :end
            group by o.email
            order by o.email
            """)
    List<CustomerStatistics> customerStatistics(@Param("start") LocalDateTime start,
                                                @Param("end") LocalDateTime end);

    // =========================================================
    // A14 배송 묶음
    // =========================================================

    // [처음 버전 — 지금은 안 씀, N+1 비교용으로 남겨 둠]
    // @Query 없음 → 이름이 곧 쿼리
    //   findBy ShippingDate And Status OrderBy Email Asc Id Asc
    //   = "배송일과 상태로 찾고, 이메일 오름차순 → id 오름차순 정렬"
    // 주문만 가져와서, Service for문에서 getItems() 할 때마다 SQL이 또 나갔음 (1+N번)
    List<Order> findByShippingDateAndStatusOrderByEmailAscIdAsc(LocalDate shippingDate, String status);

    // [지금 쓰는 버전]
    // join fetch o.items : 주문을 가져올 때 메뉴 줄도 JOIN해서 같이 채워 옴 → SQL 1번
    // distinct           : JOIN하면 메뉴 줄 수만큼 주문이 복사되니까, 같은 주문은 한 번씩만
    @Query("""
            select distinct o from Order o
            join fetch o.items
            where o.shippingDate = :shippingDate and o.status = 'PLACED'
            order by o.email, o.id
            """)
    List<Order> findPlacedWithItems(@Param("shippingDate") LocalDate shippingDate);

    // =========================================================
    // A17 접수일별 주문 통계 — "Java for문으로 세기" 방식 (SQL 1번)
    // =========================================================

    // 그날 접수된 주문을 메뉴 줄까지 통째로 가져옴. 세는 건 Service에서 for문으로
    //   left join fetch : 메뉴 줄이 하나도 없는 주문이 있어도 빠지지 않게
    //                     (그냥 join fetch면 메뉴 줄 없는 주문은 결과에서 빠짐)
    //   status 조건 없음: 취소 건수도 세야 해서 전부 가져옴
    @Query("""
            select distinct o from Order o
            left join fetch o.items
            where o.createdAt >= :start and o.createdAt < :end
            order by o.id
            """)
    List<Order> findCreatedOnWithItems(@Param("start") LocalDateTime start,
                                       @Param("end") LocalDateTime end);
}