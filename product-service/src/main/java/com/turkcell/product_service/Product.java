package com.turkcell.product_service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("products")
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    private Long id;
    private String name;
    private String description;


}
