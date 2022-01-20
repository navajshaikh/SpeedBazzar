package com.speedBazaar.controller.dto;


public class OderDto {
	
	private Integer orderId;
	private String producName;
	private Integer userId;
	public OderDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OderDto(String producName, Integer userId) {
		super();
		this.producName = producName;
		this.userId = userId;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public String getProducName() {
		return producName;
	}
	public void setProducName(String producName) {
		this.producName = producName;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "OderDto [orderId=" + orderId + ", producName=" + producName + ", userId=" + userId + "]";
	}
	
	
	

}
