package com.sonij.dgital.product.details.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "product_details")
public class ProductDetails {
	
	@Id
	@Column(name = "product_id")
	private String productId;
	
	@Column(name = "product_name")
	private String productName;
	
	@Column(name = "product_category_id")
	private int productCategoryId;
	
	@Column(name = "product_sub_category_id")
	private int productSubCategoryId;
	
	@Column(name = "product_weight")
	private Double productWeight;
	
	@Column(name = "product_description")
	private String productDescription;
	
	@Column(name = "product_image_path")
	private String productImagePath;
	
	@Column(name = "product_price")
	private Double productPrice;
	
	public ProductDetails() {
		super();
	}
	
	public ProductDetails(String productId, String productName, int productCategoryId, int productSubCategoryId,
			Double productWeight, String productDescription, String productImagePath, Double productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCategoryId = productCategoryId;
		this.productSubCategoryId = productSubCategoryId;
		this.productWeight = productWeight;
		this.productDescription = productDescription;
		this.productImagePath = productImagePath;
		this.productPrice = productPrice;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductCategoryId() {
		return productCategoryId;
	}

	public void setProductCategoryId(int productCategoryId) {
		this.productCategoryId = productCategoryId;
	}

	public int getProductSubCategoryId() {
		return productSubCategoryId;
	}

	public void setProductSubCategoryId(int productSubCategoryId) {
		this.productSubCategoryId = productSubCategoryId;
	}

	public Double getProductWeight() {
		return productWeight;
	}

	public void setProductWeight(Double productWeight) {
		this.productWeight = productWeight;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getProductImagePath() {
		return productImagePath;
	}

	public void setProductImagePath(String productImagePath) {
		this.productImagePath = productImagePath;
	}

	public Double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}
	
	
	
	

}
