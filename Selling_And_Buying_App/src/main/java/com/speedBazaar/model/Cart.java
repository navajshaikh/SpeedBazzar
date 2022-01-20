package com.speedBazaar.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity
public class Cart {
	
	
	@Id
	@GeneratedValue
	private Integer CartId;
	
	
	private Integer userId;
	
	
	private Integer productId;

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cart( Integer userId, Integer productId) {
		super();
		
		this.userId = userId;
		this.productId = productId;
	}

	public Integer getCartId() {
		return CartId;
	}

	public void setCartId(Integer cartId) {
		CartId = cartId;
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
		return "Cart [CartId=" + CartId + ", userId=" + userId + ", productId=" + productId + "]";
	}

	
	

}
