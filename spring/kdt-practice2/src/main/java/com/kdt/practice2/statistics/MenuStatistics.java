package com.kdt.practice2.statistics;

public record MenuStatistics(
        Long menuId,
        String menuName,
        Long totalQuantity,
        Long totalAmount
) {
}
