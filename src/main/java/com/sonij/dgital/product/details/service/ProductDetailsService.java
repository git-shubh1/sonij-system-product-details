package com.sonij.dgital.product.details.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sonij.dgital.product.details.dto.ProductDetailsDTO;
import com.sonij.dgital.product.details.dto.ProductDetailsResponse;
import com.sonij.dgital.product.details.dto.ResponseDTO;
import com.sonij.dgital.product.details.model.ProductDetails;
import com.sonij.dgital.product.details.model.ProductDetailsResponseList;
import com.sonij.dgital.product.details.repository.ProductDetailsRepository;

@Service
public class ProductDetailsService {
	
	@Autowired
	ProductDetailsRepository repo;
	
	public ProductDetailsResponseList getAllProducts() {
		Optional<List<Map<String,Object>>> res = repo.getAllProducts();
		ProductDetailsResponseList responseList = new ProductDetailsResponseList();
		List<ProductDetailsResponse> response = new ArrayList<>();
		if(!res.isPresent())
		  System.out.println("No Record Found");
		else{	
			List<Map<String,Object>> ls = res.get();
			ls.stream().filter(map -> map.get("category_name").equals("GOLD")).forEach(map ->{
				ProductDetailsResponse productDtlsRes = new ProductDetailsResponse();
				productDtlsRes.setProductId((String)map.get("product_id"));
				productDtlsRes.setProductName((String)map.get("product_name"));
				productDtlsRes.setProductCategory((String)map.get("category_name"));
				System.out.println(productDtlsRes.toString());
			    response.add(productDtlsRes);	
				});
			
			
//			ls.forEach(map -> {
//				ProductDetailsResponse productDtlsRes = new ProductDetailsResponse();
//				productDtlsRes.setProductId((String)map.get("product_id"));
//				productDtlsRes.setProductName((String)map.get("product_name"));
//				productDtlsRes.setProductCategory((String)map.get("category_name"));
//				System.out.println(productDtlsRes.toString());
//				response.add(productDtlsRes);
//			});
//			responseList.setProductDetailsList(res.get());
		}
		responseList.setProductDetailsList(response);
		return responseList;
	}
	
	public String addProduct(ProductDetailsDTO productDetailsDTO) {
		ProductDetails prodDetails = new ProductDetails();
		prodDetails.setProductId(productDetailsDTO.getProductId());
		prodDetails.setProductName(productDetailsDTO.getProductName());
		prodDetails.setProductCategoryId(productDetailsDTO.getProductCategoryId());
		prodDetails.setProductSubCategoryId(productDetailsDTO.getProductSubCategoryId());
		prodDetails.setProductWeight(productDetailsDTO.getProductWeight());
		prodDetails.setProductDescription(productDetailsDTO.getProductDescription());
		prodDetails.setProductImagePath(productDetailsDTO.getProductImagePath());
		prodDetails.setProductPrice(productDetailsDTO.getProductPrice());
		return repo.addProductDetails(prodDetails);
	}
	
	public ResponseDTO getProductById(String productId) {
		List<ProductDetails> resList = repo.getProductById(productId);
		ResponseDTO resDTO = new ResponseDTO();
		if(null!=resList && !resList.isEmpty()) {
	      resDTO.setStatusCode("0");
	      resDTO.setStatusMessage("SUCCESS");
			resList.forEach(product -> {
	    	  ProductDetailsDTO ob = new ProductDetailsDTO();
	    	  ob.setProductId(product.getProductId());
	    	  ob.setProductDescription(product.getProductDescription());
	    	  resDTO.setProductDetailsDTO(ob);
	      });
	    }else {
	    	resDTO.setStatusCode("999");
		    resDTO.setStatusMessage("FAILURE");
		    resDTO.setDescription("Record Not Found");
	    }
		return resDTO;	
	}

}
