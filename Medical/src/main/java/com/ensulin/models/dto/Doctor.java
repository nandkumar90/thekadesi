package com.ensulin.models.dto;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Where;

@Entity
@Table(name="med_personal_details")
@Where(clause="user_type='doctor'")
public class Doctor {

	@Id
	@Column(name="user_id")
	private String username;
	
	@Column(name="password")
	private String password;
	
	@Column(name="user_type")
	private String user_type;
	
	@Embedded
	private Person personalDetails;
	
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "doctor", cascade = CascadeType.ALL)
	private DocEducation eduInfo;
	
	@OneToMany(mappedBy="doctor")
	private Set<DocExperience> pastExperiences;
	
	@OneToMany(mappedBy="doctor")
	private Set<DocSchedule> shiftSchedules;
	
	@OneToMany(mappedBy="doctor")
	private Set<Appointment> appointments;
	
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
	
	public Person getPersonalDetails() {
		return personalDetails;
	}

	public void setPersonalDetails(Person personalDetails) {
		this.personalDetails = personalDetails;
	}

	public Set<DocExperience> getPastExperiences() {
		return pastExperiences;
	}

	public void setPastExperiences(Set<DocExperience> pastExperiences) {
		this.pastExperiences = pastExperiences;
	}

	public Set<DocSchedule> getShiftSchedules() {
		return shiftSchedules;
	}

	public void setShiftSchedules(Set<DocSchedule> shiftSchedules) {
		this.shiftSchedules = shiftSchedules;
	}

}
