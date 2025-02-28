package com.turkcell.product_service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping
    public Product getProducts() {
        return productRepository.findByName("Ertan").orElse(null);
    }

    @PostMapping("")
    public void createProduct(@RequestBody Product product) {
        productRepository.save(product);
    }
}
