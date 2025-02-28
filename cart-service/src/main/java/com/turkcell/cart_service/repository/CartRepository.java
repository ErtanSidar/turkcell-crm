package com.turkcell.cart_service.repository;

import com.turkcell.cart_service.Cart;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CartRepository extends MongoRepository<Cart, Long> {
}
