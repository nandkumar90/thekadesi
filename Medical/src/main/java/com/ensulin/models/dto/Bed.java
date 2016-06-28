package com.ensulin.models.dto;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="bed")
public class Bed {
	private String  bedId;
	private String  bedNumber;
	private bedType bedtype=bedType.general;
	private bedStatus bedstatus=bedStatus.free;
	private enum  bedType{general, privtae, icu, ccu};
    private enum bedStatus{ free,occuipied,  maintaince;}
    @OneToOne(mappedBy="patient")
    private Patient patient;
	public String getBedId() {
		return bedId;
	}
	public void setBedId(String bedId) {
		this.bedId = bedId;
	}
	public String getBedNumber() {
		return bedNumber;
	}
	public void setBedNumber(String bedNumber) {
		this.bedNumber = bedNumber;
	}
	public bedType getBedtype() {
		return bedtype;
	}
	public void setBedtype(bedType bedtype) {
		this.bedtype = bedtype;
	}
	public bedStatus getBedstatus() {
		return bedstatus;
	}
	public void setBedstatus(bedStatus bedstatus) {
		this.bedstatus = bedstatus;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	
}
