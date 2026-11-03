package com.kdt.practice2.statistics;

import com.kdt.practice2.order.Order;
import com.kdt.practice2.order.OrderItem;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
@Transactional(readOnly = true)   // 조회만 하니까 readOnly
public class StatisticsLoopService {

    private final OrderStatisticsRepository repository;

    public StatisticsLoopService(OrderStatisticsRepository repository) {
        this.repository = repository;
    }

    public OrderStatistics orderStatistics(LocalDate date) {
        // 하루 범위: 그날 0시 ~ 다음 날 0시 (기존 방식과 똑같음)
        LocalDateTime start = date.atStartOfDay();
        LocalDateTime end = date.plusDays(1).atStartOfDay();

        // [재료 받기] 그날 주문을 메뉴 줄까지 통째로 (SQL 1번)
        List<Order> orders = repository.findCreatedOnWithItems(start, end);

        // [세기] 여기부터는 DB 안 씀. 순수 Java
        long orderCount = orders.size();   // 받아 온 주문 개수 = 전체 주문 수
        long placedOrderCount = 0;
        long cancelledOrderCount = 0;
        long totalQuantity = 0;
        long totalAmount = 0;

        for (Order order : orders) {                       // 주문 하나씩 꺼내서
            if ("PLACED".equals(order.getStatus())) {      // 접수 상태면
                placedOrderCount++;                        //   PLACED 개수 +1
                for (OrderItem item : order.getItems()) {  //   그 주문의 메뉴 줄을 돌면서
                    totalQuantity += item.getQuantity();   //     수량 더하기
                    totalAmount += item.getLineAmount();   //     금액 더하기
                }
            } else if ("CANCELLED".equals(order.getStatus())) {  // 취소 상태면
                cancelledOrderCount++;                           //   취소 개수 +1 (수량·금액은 안 더함)
            }
        }

        // [응답 만들기]
        return new OrderStatistics(orderCount, placedOrderCount, cancelledOrderCount,
                totalQuantity, totalAmount);
    }
}