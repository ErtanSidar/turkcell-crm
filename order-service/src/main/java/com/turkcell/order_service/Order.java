package com.turkcell.order_service;

import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Setter
public class Order {
    private Long id;
    private Long customerId;
    private BigDecimal totalAmount;
    private OrderStatus status;
    private LocalDateTime orderDate;
    private LocalDateTime updatedAt;
    private String shippingAddress;
    private String billingAddress;
}
