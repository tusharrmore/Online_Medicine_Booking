package com.yash.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Register {

	@Id
	private String userId;
	private String firstname;
	private String lastname;
	private String youremail;
	private String phonenumber;
	private String password;
	private String cpassword;
	private String gender;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getYouremail() {
		return youremail;
	}

	public void setYouremail(String youremail) {
		this.youremail = youremail;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCpassword() {
		return cpassword;
	}

	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Register(String firstname, String lastname, String userId, String youremail, String phonenumber,
			String password, String cpassword, String gender) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.userId = userId;
		this.youremail = youremail;
		this.phonenumber = phonenumber;
		this.password = password;
		this.cpassword = cpassword;
		this.gender = gender;
	}

	public Register() {
		super();
		// TODO Auto-generated constructor stub
	}

}
