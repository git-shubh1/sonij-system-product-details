package com.sonij.dgital.product.details.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sonij.dgital.product.details.dto.ProductDetailsDTO;
import com.sonij.dgital.product.details.dto.ResponseDTO;
import com.sonij.dgital.product.details.model.ProductDetailsResponseList;
import com.sonij.dgital.product.details.service.ProductDetailsService;

@RestController
public class ProductDetailsController {
	
	@Autowired
	ProductDetailsService service;
	
	@GetMapping("/get-all-products")
	public ResponseEntity<ProductDetailsResponseList> getAllProducts() {
		
		ProductDetailsResponseList response = service.getAllProducts();
		return new ResponseEntity<ProductDetailsResponseList>(response, HttpStatus.OK);
	}
	
	@PostMapping("/add-product")
	public String addProduct(@RequestBody ProductDetailsDTO productDetails) {
		return service.addProduct(productDetails);	
	}
	
	@GetMapping("/product-by-id/{productId}")
	public ResponseDTO getProductDetailsById(@PathVariable String productId) {
		return service.getProductById(productId);
	}
	
}
