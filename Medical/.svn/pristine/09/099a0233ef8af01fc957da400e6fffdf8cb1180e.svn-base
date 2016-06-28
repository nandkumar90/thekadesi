package com.ensulin.models.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="med_doctor_edu_info")
public class DocEducation {

	@Id
	@Column(name="doctor_id")
	@GeneratedValue(generator="gen")
    @GenericGenerator(name="gen", strategy="foreign", parameters={@Parameter(name="property", value="doctor")})
	private String doctor_id;
	
	@Column(name="education")
	private String educationDetails;
	
	@OneToOne
    @PrimaryKeyJoinColumn
	private Doctor doctor;
	
	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public String getDoctor_id() {
		return doctor_id;
	}

	public void setDoctor_id(String doctor_id) {
		this.doctor_id = doctor_id;
	}

	public String getEducationDetails() {
		return educationDetails;
	}

	public void setEducationDetails(String educationDetails) {
		this.educationDetails = educationDetails;
	}

}
