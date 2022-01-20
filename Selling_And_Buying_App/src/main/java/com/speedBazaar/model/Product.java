package com.speedBazaar.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id
	@GeneratedValue
	private Integer productId;
	
	
	private String productName;
	private Float productPrice;
	private String catagory;
	private Integer quantity;
	private Date date;
	private Integer userId;
	private Long adminId;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Float getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Float productPrice) {
		this.productPrice = productPrice;
	}
	public String getCatagory() {
		return catagory;
	}
	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Long getAdminId() {
		return adminId;
	}
	public void setAdminId(Long adminId) {
		this.adminId = adminId;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice + ", catagory="
				+ catagory + ", quantity=" + quantity + ", date=" + date + ", userId=" + userId + ", adminId=" + adminId
				+ "]";
	}

	public Product( String productName, Float productPrice, String catagory, Integer quantity, Date date,
			Integer userId) {
		super();
		
		this.productName = productName;
		this.productPrice = productPrice;
		this.catagory = catagory;
		this.quantity = quantity;
		this.date = date;
		this.userId = userId;
	}

	public Product( String productName, Float productPrice, String catagory, Integer quantity, Date date,
			Long adminId) {
		super();
		
		this.productName = productName;
		this.productPrice = productPrice;
		this.catagory = catagory;
		this.quantity = quantity;
		this.date = date;
		this.adminId = adminId;
	}
	
	
	
	

	
	

}
