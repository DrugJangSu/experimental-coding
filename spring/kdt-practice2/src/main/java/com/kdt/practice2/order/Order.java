package com.kdt.practice2.order;


import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "orders")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private String address;
    private String postcode;
    private String memo;
    private String status;
    private Integer totalAmount;
    private LocalDate shippingDate;
    private LocalDateTime createdAt;
    private LocalDateTime cancelledAt;

    @OneToMany(mappedBy = "order")
    private List<OrderItem> items = new ArrayList<>();
}
