package com.kdt.practice2.statistics;

public record OrderStatistics(
        long orderCount,
        long placedOrderCount,
        long cancelledOrderCount,
        long totalQuantity,
        long totalAmount
) {
}
