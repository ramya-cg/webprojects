package com.demo.dto;

public class Model {

	

	private String fname;
	private String lname;
	private String gender;
	private String lang;
	private String address;
	private String city;
	private String email;

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Model [fname=" + fname + ", lname=" + lname + ", gender="
				+ gender + ", lang=" + lang + ", address=" + address
				+ ", city=" + city + ", email=" + email + "]";
	}
}
