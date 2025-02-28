package com.turkcell.cart_service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("carts")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cart {
    private Long id;
    private Long customerId;
}