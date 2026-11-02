package com.kdt.practice2.statistics;

import java.time.LocalDate;
import java.util.List;

public record DeliveryBatch(

        String email,
        String address,
        String postcode,
        LocalDate shippingDate,
        List<Long> orderIds,
        long totalQuantity,
        long totalAmount
) {
}
