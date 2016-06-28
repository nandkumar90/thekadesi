package com.ensulin.models.dto;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="med_doctor_info")
public class DocSchedule {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
	private long id;
	
	@ManyToOne
    @JoinColumn(name="doctor_id", nullable=false)
	private Doctor doctor;
	
	@Column(name="hospital_id", nullable=true)
	private String hospitalId;
	
	@Column(name="hospital_name")
	private String hospitalName;
	
	@Column(name="in_time")
	private Time inTime;
	
	@Column(name="out_time")
	private Time outTime;
	
	@Column(name="days")
	private String days;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public String getHospitalId() {
		return hospitalId;
	}

	public void setHospitalId(String hospitalId) {
		this.hospitalId = hospitalId;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public Time getInTime() {
		return inTime;
	}

	public void setInTime(Time inTime) {
		this.inTime = inTime;
	}

	public Time getOutTime() {
		return outTime;
	}

	public void setOutTime(Time outTime) {
		this.outTime = outTime;
	}

	public String getDays() {
		return days;
	}

	public void setDays(String days) {
		this.days = days;
	}
		
}
