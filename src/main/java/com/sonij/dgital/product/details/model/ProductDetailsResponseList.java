package com.sonij.dgital.product.details.model;

import java.util.List;

import com.sonij.dgital.product.details.dto.ProductDetailsResponse;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class ProductDetailsResponseList {
	
	List<ProductDetailsResponse> productDetailsList;

	public List<ProductDetailsResponse> getProductDetailsList() {
		return productDetailsList;
	}

	public void setProductDetailsList(List<ProductDetailsResponse> productDetailsList) {
		this.productDetailsList = productDetailsList;
	}
	
	

}
