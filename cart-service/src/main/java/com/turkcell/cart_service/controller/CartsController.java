package com.turkcell.cart_service.controller;

import com.turkcell.cart_service.Cart;
import com.turkcell.cart_service.repository.CartRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/cart")
public class CartsController {

    private final CartRepository cartRepository;

    public CartsController(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    @GetMapping
    public String get() {
        return "Cart Service";
    }

    @PostMapping
    public void createCart(@RequestBody Cart cart) {
        cartRepository.save(cart);
    }
}
