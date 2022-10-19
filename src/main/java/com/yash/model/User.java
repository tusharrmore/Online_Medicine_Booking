package com.yash.model;

import javax.persistence.Entity;
import javax.persistence.Id;

//@Entity
public class User {
//	@Id
	private String userId;
	private String password;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User(String userId, String password) {
		super();
		this.userId = userId;
		this.password = password;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", password=" + password + "]";
	}
	
	
}