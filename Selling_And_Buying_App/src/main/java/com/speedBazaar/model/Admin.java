package com.speedBazaar.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Admin {
	
	@Id
	@GeneratedValue
	private Long adminId;
	private String adminName;
	private String emailId;
	private String password;
	private String mobileNo;

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Admin( String adminName, String emailId, String password, String mobileNo) {
		super();
		
		this.adminName = adminName;
		this.emailId = emailId;
		this.password = password;
		this.mobileNo = mobileNo;
	}
	public Long getAdminId() {
		return adminId;
	}
	public void setAdminId(Long adminId) {
		this.adminId = adminId;
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
	
	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", emailId=" + emailId + ", password="
				+ password + ", mobileNo=" + mobileNo + "]";
	}

}
