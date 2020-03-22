package com.product.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.product.core.model.Product;
import com.product.core.repository.ProductsJpaRepository;

@RestController
public class ProductsController {
	
	@Autowired
	private ProductsJpaRepository productsJpaRepo;	

	@GetMapping("/products")
	public List<Product> getAllProducts(){
		return productsJpaRepo.findAll();
	}
	
	@GetMapping("/product/{id}")
	public Product getProductById(@PathVariable final Long id) {
		return productsJpaRepo.findById(id).get();
	}
	
}
