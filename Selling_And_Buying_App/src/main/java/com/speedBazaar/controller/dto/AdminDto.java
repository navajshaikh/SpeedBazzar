package com.speedBazaar.controller.dto;

public class AdminDto {

	
	private String adminName;
	private String emailId;
	private String password;
	private String mobileNo;
	public AdminDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AdminDto(String adminName, String emailId, String password, String mobileNo) {
		super();
		this.adminName = adminName;
		this.emailId = emailId;
		this.password = password;
		this.mobileNo = mobileNo;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	
}
