package com.ensulin.models.dto;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Id;

@Embeddable
public class Person {

	@Column(name="user_name")
	private String user_name;
	
	@Column(name="mobile")
	private String mobileNumber;
	
	@Column(name="date_Of_Birth")
	private Date dateOfBirth;
	
	@Column(name="email")
	private String email;
	
	@Column(name="gender")
	private char gender;
	
	@Embedded
	private Address address;
	
	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
			java.util.Date d = sdf.parse(dateOfBirth);
			this.dateOfBirth = new Date(d.getTime());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getUser_Name() {
		return user_name;
	}

	public void setUser_Name(String fName) {
		this.user_name = fName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String toString(){
		return String.format("{fName:%s,mobileNumber:%s,address:%s}", user_name,mobileNumber,address.toString());
	}
	
}
