package com.ensulin.models.dto;

import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="med_appointment_info")
public class Appointment{

	@Id
	@Column(name="appointment_id")
	private int appointmentId;
	
	/*@OneToOne(fetch = FetchType.LAZY, mappedBy = "appointment", cascade = CascadeType.ALL)
	private Prescription prescription;*/
	
	@ManyToOne
	@JoinColumn(name="doctor_id", nullable=false)
	private Doctor doctor;
	
	@Column(name="appointment_time")
	Timestamp appointmentTime;
	
	@ManyToOne
	@JoinColumn(name="patient_id")
	private Patient patient;
	
	@Column(name="appointment_token")
	private String appointmentToken;
	
	@Column(name="appointment_type")
	private String appointmentType;
	
	@Column(name="")
	private String status;
	
	public int getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}
	
	/*public Prescription getPrescription() {
		return prescription;
	}
	public void setPrescription(Prescription prescription) {
		this.prescription = prescription;
	}*/
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public Timestamp getAppointmentTime() {
		return appointmentTime;
	}
	public void setAppointmentTime(Timestamp appointmentTime) {
		this.appointmentTime = appointmentTime;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public String getAppointmentToken() {
		return appointmentToken;
	}
	public void setAppointmentToken(String appointmentToken) {
		this.appointmentToken = appointmentToken;
	}
	public String getAppointmentType() {
		return appointmentType;
	}
	public void setAppointmentType(String appointmentType) {
		this.appointmentType = appointmentType;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
