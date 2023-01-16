package com.projetsoc.productserver.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.projetsoc.productserver.models.Product;

public interface ProductRepository extends MongoRepository<Product, String> {
	
}
