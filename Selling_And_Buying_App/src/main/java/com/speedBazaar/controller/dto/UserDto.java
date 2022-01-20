package com.speedBazaar.controller.dto;

import java.util.Date;

public class UserDto {
	
	private String userName;
	private String emailId;
	private String password;
	private String mobileNo;
	public UserDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserDto(String userName, String emailId, String password, String mobileNo) {
		super();
		this.userName = userName;
		this.emailId = emailId;
		this.password = password;
		this.mobileNo = mobileNo;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
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
	@Override
	public String toString() {
		return "UserDto [userName=" + userName + ", emailId=" + emailId + ", password=" + password + ", mobileNo="
				+ mobileNo + "]";
	}
	
	
	
	
}
