package com.product.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.product.core.model.Product;

@Component
public interface ProductsJpaRepository extends JpaRepository<Product, Long>{
	
}
