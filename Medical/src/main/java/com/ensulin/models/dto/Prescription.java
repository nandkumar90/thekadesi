package com.ensulin.models.dto;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;


public class Prescription {

	@Id
	@Column(name="prescriptionId")
	private long prescriptionId;
	
	@Column(name="symptoms")
	private String symptoms;
	
	@Column(name="prescription")
	private Blob prescription;
	
	@OneToOne
    @PrimaryKeyJoinColumn
	private Appointment appointment;

	public long getPrescriptionId() {
		return prescriptionId;
	}

	public void setPrescriptionId(long prescriptionId) {
		this.prescriptionId = prescriptionId;
	}

	public String getSymptoms() {
		return symptoms;
	}

	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}

	public Blob getPrescription() {
		return prescription;
	}

	public void setPrescription(Blob prescription) {
		this.prescription = prescription;
	}

	public Appointment getAppointment() {
		return appointment;
	}

	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}

}
