package com.ensulin.models.dto;


import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Where;


@Entity
@Table(name="med_personal_details")
@Where(clause="user_type='patient'")
public class Patient {

	@Id
	@Column(name="user_id")
	private String username;
	
	@Column(name="password")
	private String password;
	
	@Column(name="user_type")
	private String user_type;
	
	@Embedded
	private Person personalDetails;
	
	@OneToMany(mappedBy="doctor")
	private Set<Appointment> appointments;
	
	public Patient(){
		user_type="patient";
	}
	
	public Person getPersonalDetails() {
		return personalDetails;
	}

	public void setPersonalDetails(Person personalDetails) {
		this.personalDetails = personalDetails;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String toString(){
		return String.format("{username:%s, password:%s,personalDetails:%s}", username,password,personalDetails.toString());
	}

}
