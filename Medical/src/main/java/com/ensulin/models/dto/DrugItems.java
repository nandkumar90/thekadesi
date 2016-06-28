package com.ensulin.models.dto;

import java.sql.Date;

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
@Table(name = "drugitems")
public class DrugItems {

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "drug_id", insertable = true, updatable = true, nullable = false, unique = true)
	long drug_id;
	@Id
	@Column(name = "batchNo")
	private long batchNo;
	@Column(name = "exexpiryDate")
	private Date expiryDate;
	// amount per unit
	@Column(name = "amountperunit")
	private double amountperunit;
	@Column(name = "manufacturingDate")
	private Date manufacturingDate;
	@Column(name = "availableAmount")
	private Long availableAmount = (long) 0;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "supplier_id", insertable = true, updatable = true, nullable = false, unique = true)
	Supplier supplier;

	public long getDrug_id() {
		return drug_id;
	}

	public void setDrug_id(long drug_id) {
		this.drug_id = drug_id;
	}

	public long getBatchNo() {
		return batchNo;
	}

	public void setBatchNo(long batchNo) {
		this.batchNo = batchNo;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public double getAmountperunit() {
		return amountperunit;
	}

	public void setAmountperunit(double amountperunit) {
		this.amountperunit = amountperunit;
	}

	public Date getManufacturingDate() {
		return manufacturingDate;
	}

	public void setManufacturingDate(Date manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}

	public Long getAvailableAmount() {
		return availableAmount;
	}

	public void setAvailableAmount(Long availableAmount) {
		this.availableAmount = availableAmount;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

}
