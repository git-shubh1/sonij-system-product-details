package com.sonij.dgital.product.details.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sonij.dgital.product.details.model.ProductDetails;

@Repository
public class ProductDetailsRepository {
	
	@Autowired
	NamedParameterJdbcTemplate jdbcTemplate;
	
	public String addProductDetails(ProductDetails productDetails) {
		String sql = "insert into product_details values(:productId, :productName, :productCategoryId, :productSubCategoryId, :productWeight, :productDescription, :productImagePath, :productPrice)";
		Map<String,Object> hp = new HashMap<>();
		hp.put("productId", productDetails.getProductId());
		hp.put("productName", productDetails.getProductName());
		hp.put("productCategoryId", productDetails.getProductCategoryId());
		hp.put("productSubCategoryId", productDetails.getProductSubCategoryId());
		hp.put("productWeight", productDetails.getProductWeight());
		hp.put("productDescription", productDetails.getProductDescription());
		hp.put("productImagePath", productDetails.getProductImagePath());
		hp.put("productPrice", productDetails.getProductPrice());
		int result = jdbcTemplate.update(sql, hp);
		if(result>0)
		return "Record Added";
		else
		return "Record Not Added";	
	}
	
	public Optional<List<Map<String,Object>>> getAllProducts() {
			
	String sql = "SELECT * FROM product_details JOIN (product_category,product_subcategory) ON product_category.category_id = product_details.product_category_id AND product_subcategory.s_categoryid = product_details.product_sub_category_id ";
//	List<ProductDetails> res = jdbcTemplate.query(sql, new BeanPropertyRowMapper(ProductDetails.class));
	List<Map<String,Object>> res = jdbcTemplate.queryForList(sql, new HashMap<>());
	return Optional.ofNullable(res);

	}
	
	public List<ProductDetails> getProductById(String productId) {
    
	String sql = "SELECT * FROM product_details WHERE product_id= :productId";
	Map<String,Object> map = new HashMap<>();
	map.put("productId", productId);
	List<ProductDetails> res = jdbcTemplate.query(sql, map, new BeanPropertyRowMapper(ProductDetails.class));
	if(!res.isEmpty()) {
		System.out.println("Record Present with Id = "+productId);
		return res;
	}else {
		System.out.println("Record Not Found");
		return null;
	  }
	}
	
	

}
