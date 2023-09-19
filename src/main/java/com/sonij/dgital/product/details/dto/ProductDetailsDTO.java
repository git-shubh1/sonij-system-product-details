package com.sonij.dgital.product.details.dto;

public class ProductDetailsDTO {

	private String productId;

	private String productName;

	private int productCategoryId;

	private int productSubCategoryId;

	private Double productWeight;

	private String productDescription;

	private String productImagePath;

	private Double productPrice;
	
	public ProductDetailsDTO() {
		super();
	}

	public ProductDetailsDTO(String productId, String productName, int productCategoryId, int productSubCategoryId,
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
