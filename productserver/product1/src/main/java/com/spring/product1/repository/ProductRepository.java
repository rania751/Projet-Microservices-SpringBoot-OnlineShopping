package com.spring.product1.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.product1.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {
}