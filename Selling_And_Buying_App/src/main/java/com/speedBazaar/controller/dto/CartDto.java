package com.speedBazaar.controller.dto;

import org.springframework.beans.factory.annotation.Autowired;

import com.speedBazaar.model.Product;
import com.speedBazaar.model.User;

public class CartDto {

	
	private Integer userId;
	private Integer productId;
	public CartDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CartDto(Integer userId, Integer productId) {
		super();
		this.userId = userId;
		this.productId = productId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	@Override
	public String toString() {
		return "CartDto [userId=" + userId + ", productId=" + productId + "]";
	}
	
	
}
