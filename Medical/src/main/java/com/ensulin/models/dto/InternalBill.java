package com.ensulin.models.dto;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.engine.internal.Cascade;

import com.ensulin.models.dto.Appointment;


@Entity
@Table(name="bill")
public class InternalBill {
	@Id
	@Column(name="billid")
	private long billid;
	@Column(name="doctor_id")
	private long doctor_Id;
	@Column(name="patient_id")
	private long patient_id;
	// drug can be taken after appointment
	
	//need to discuss it is important to be contain because its going for bot appointment and not appointment related.
	@OneToMany
	@JoinColumn(name="patient_id")
	private List<Appointment> appointment;

	@Embedded
	private BillItem billableItems;
	
	@Column(name="paidamount")
	private double paidAmount;
	@Column(name="discount")
	private double discount;
	@Column(name="bildate")
	private Date bilDate;
	@Column(name="bilstats")
    private BilStats bilStats=BilStats.unpaid;
	
	enum BilStats {
		paid, unpaid, partialfpaid, free
	}
		
	
	public long getDoctor_Id() {
		return doctor_Id;
	}

	public void setDoctor_Id(long doctor_Id) {
		this.doctor_Id = doctor_Id;
	}

	public long getPatient_id() {
		return patient_id;
	}

	public void setPatient_id(long patient_id) {
		this.patient_id = patient_id;
	}

	public long getId() {
		return billid;
	}

	public void setId(long id) {
		this.billid = id;
	}

	public BillItem getBillableItems() {
		return billableItems;
	}

	public void setBillableItems(BillItem billableItems) {
		this.billableItems = billableItems;
	}

	
	public BilStats getBilStats() {
		return bilStats;
	}

	public void setBilStats(BilStats bilStats) {
		this.bilStats = bilStats;
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
	
	public long getBillid() {
		return billid;
	}

	public void setBillid(long billid) {
		this.billid = billid;
	}

	public List<Appointment> getAppointment() {
		return appointment;
	}

	public void setAppointment(List<Appointment> appointment) {
		this.appointment = appointment;
	}


}