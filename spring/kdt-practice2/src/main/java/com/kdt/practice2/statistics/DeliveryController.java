package com.kdt.practice2.statistics;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;


@RestController
public class DeliveryController {
    private final DeliveryService deliveryService;

    public DeliveryController(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }

    @GetMapping("/api/v1/delivery-batches")
    public List<DeliveryBatch> batches(
            @RequestParam("shippingDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate shippingDate) {
        return deliveryService.batches(shippingDate);
    }
}