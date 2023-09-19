package com.sonij.dgital.product.details.dto;

public class ResponseDTO {
	
	private String statusCode;
	private String statusMessage;
	private ProductDetailsDTO productDetailsDTO;
	private String description;
	
	public ResponseDTO() {
		super();
	}

	public ResponseDTO(String statusCode, String statusMessage, ProductDetailsDTO productDetailsDTO,
			String description) {
		super();
		this.statusCode = statusCode;
		this.statusMessage = statusMessage;
		this.productDetailsDTO = productDetailsDTO;
		this.description = description;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusMessage() {
		return statusMessage;
	}

	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

	public ProductDetailsDTO getProductDetailsDTO() {
		return productDetailsDTO;
	}

	public void setProductDetailsDTO(ProductDetailsDTO productDetailsDTO) {
		this.productDetailsDTO = productDetailsDTO;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
