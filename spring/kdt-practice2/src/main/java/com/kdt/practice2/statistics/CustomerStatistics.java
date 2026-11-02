package com.kdt.practice2.statistics;

public record CustomerStatistics(
        String email,
        Long orderCount,
        Long placedOrderCount,
        Long cancelledOrderCount,
        Long totalQuantity,
        Long totalAmount
) {
}
