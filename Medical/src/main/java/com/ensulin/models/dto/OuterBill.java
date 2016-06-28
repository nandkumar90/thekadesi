package com.ensulin.models.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Id;


public class OuterBill {
	@Id
	@Column(name = "billid")
	private long billid;
	private long doctorId;
	private long patientId;
	// drug can be taken after appointment

	// need to discuss it is important to be contain because its going for bot
	// appointment and not appointment related.
	@Embedded
	private Appointment appointment;
	@Embedded
	private BillItem billableItems;
	private double paidAmount;
	private double discount;
	private Date bilDate;
	private BillState billState = BillState.unpaid;

	enum BillState {
		paid, unpaid, partialfpaid, free
	}

	public long getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(long doctorId) {
		this.doctorId = doctorId;
	}

	public long getPatientId() {
		return patientId;
	}

	public void setPatientId(long patientId) {
		this.patientId = patientId;
	}

	public long getId() {
		return billid;
	}

	public void setId(long id) {
		this.billid = id;
	}

	public Appointment getAppointment() {
		return appointment;
	}

	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}

	public BillItem getBillableItems() {
		return billableItems;
	}

	public void setBillableItems(BillItem billableItems) {
		this.billableItems = billableItems;
	}

	public BillState getBillState() {
		return billState;
	}

	public void setBillState(BillState billState) {
		this.billState = billState;
	}

	public double getPaidAmount() {
		return paidAmount;
	}

	public void setPaidAmount(double paidAmount) {
		this.paidAmount = paidAmount;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public Date getBilDate() {
		return bilDate;
	}

	public void setBilDate(Date bilDate) {
		this.bilDate = bilDate;
	}

}
