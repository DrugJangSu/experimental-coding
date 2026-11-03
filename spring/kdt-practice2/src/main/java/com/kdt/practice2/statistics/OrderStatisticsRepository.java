package com.kdt.practice2.statistics;

import com.kdt.practice2.order.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface OrderStatisticsRepository extends JpaRepository<Order, Long> {

    @Query("select count(o)  from Order o "
    + "where o.createdAt >= :start and o.createdAt < :end")
    long countOrders(@Param("start") LocalDateTime start,
                     @Param("end") LocalDateTime end);
    @Query("select count(o) from Order o "
    + "where o.status = :status and o.createdAt >= :start and o.createdAt < :end")
    long countOrdersByStatus(@Param("status") String status,
                             @Param("start") LocalDateTime start,
                             @Param("end") LocalDateTime end);

    @Query("select coalesce(sum(i.quantity), 0L) from OrderItem i join i.order o "
            + "where o.status = 'PLACED' and o.createdAt >= :start and o.createdAt < :end")
    long sumPlacedQuantity(@Param("start") LocalDateTime start,
                           @Param("end") LocalDateTime end);

    @Query("select coalesce(sum(i.lineAmount), 0L) from OrderItem i join i.order o "
            + "where o.status = 'PLACED' and o.createdAt >= :start and o.createdAt < :end")
    long sumPlacedAmount(@Param("start") LocalDateTime start,
                         @Param("end") LocalDateTime end);

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

    List<Order> findByShippingDateAndStatusOrderByEmailAscIdAsc(LocalDate shippingDate, String status);

    @Query("""
            select distinct o from Order o
            join fetch o.items
            where o.shippingDate = :shippingDate and o.status = 'PLACED'
            order by o.email, o.id
            """)
    List<Order> findPlacedWithItems(@Param("shippingDate") LocalDate shippingDate);
}
