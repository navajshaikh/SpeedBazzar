package com.speedBazaar.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class History {
	
	@Id
	@GeneratedValue
	private Integer orderId;
	private String productName;
	private Integer userId;
	public History() {
		super();
		// TODO Auto-generated constructor stub
	}
	public History(String productName, Integer userId) {
		super();
		this.productName = productName;
		this.userId = userId;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public String getProductName() {
		return productName;
	}
	@Autowired
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	
	public Integer getUserId() {
		return userId;
	}
	
	@Autowired
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "History [orderId=" + orderId + ", productName=" + productName + ", userId=" + userId + "]";
	}

	
	

}
