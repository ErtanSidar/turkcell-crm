package com.turkcell.product_service;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ProductRepository extends MongoRepository<Product, Long> {
    Optional<Product> findByName(String name);
}
