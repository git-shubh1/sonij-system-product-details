package com.sonij.dgital.product.details.dto;

public class ProductDetailsResponse {
	
	private String productId;
	private String productName;
	private String productCategory;
	private String productSubCategory;
	private Double productWeight;
	private String productDescription;
	private String productImagePath;
	private Double productPrice;
	
	public ProductDetailsResponse() {
		super();
	}

	public ProductDetailsResponse(String productId, String productName, String productCategory,
			String productSubCategory, Double productWeight, String productDescription, String productImagePath,
			Double productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCategory = productCategory;
		this.productSubCategory = productSubCategory;
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

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public String getProductSubCategory() {
		return productSubCategory;
	}

	public void setProductSubCategory(String productSubCategory) {
		this.productSubCategory = productSubCategory;
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

	@Override
	public String toString() {
		return "ProductDetailsResponse [productId=" + productId + ", productName=" + productName + ", productCategory="
				+ productCategory + ", productSubCategory=" + productSubCategory + ", productWeight=" + productWeight
				+ ", productDescription=" + productDescription + ", productImagePath=" + productImagePath
				+ ", productPrice=" + productPrice + "]";
	}
	
	

}
