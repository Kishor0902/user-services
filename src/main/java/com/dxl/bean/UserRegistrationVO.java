package com.dxl.bean;

import java.io.Serializable;

/**
 * @author kishor.jadhav
 *
 */
public class UserRegistrationVO implements Serializable {
	private String userName;
	private String password;
	private String addresss;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddresss() {
		return addresss;
	}
	public void setAddresss(String addresss) {
		this.addresss = addresss;
	}
	
}
