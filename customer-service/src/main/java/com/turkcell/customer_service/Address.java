package com.turkcell.customer_service;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Entity
@Table(name = "addresses")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    @Id
    @UuidGenerator
    private UUID id;
    private Long customerId;
    private String addressType; // billing, shipping etc.
    private String street;
    private String city;
    private String country;
    private String postalCode;
}
