package com.turkcell.cart_service;

import java.math.BigDecimal;

public class CartItem {
    private Long id;
    private Long cartId;
    private Long productId;
    private Integer quantity;
    private BigDecimal price;
}
