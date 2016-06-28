package com.ensulin.models.dto;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="drug")
public class Drug  {
	@Id
	@Column(name="drug_id")
	private long drug_id;
	
	@Column(name="drugname")
    private String drugName;

	@Column(name="drugunits")
	private String drugunits;
    @Column(name="drugsalt")
	private String drugsalt;
    @Column(name="drugstrength")
    private int drugstrength;
    //can it wld be logical to add expiry  duration for drug

    @OneToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="manufacturer_id", insertable=true, updatable=true, unique=true, nullable=false)
    Manufacturer manufacturer;

	public long getDrug_id() {
		return drug_id;
	}

	public void setDrug_id(long drug_id) {
		this.drug_id = drug_id;
	}

	public String getDrugName() {
		return drugName;
	}

	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}

	public String getDrugunits() {
		return drugunits;
	}

	public void setDrugunits(String drugunits) {
		this.drugunits = drugunits;
	}

	public String getDrugsalt() {
		return drugsalt;
	}

	public void setDrugsalt(String drugsalt) {
		this.drugsalt = drugsalt;
	}

	public int getDrugstrength() {
		return drugstrength;
	}

	public void setDrugstrength(int drugstrength) {
		this.drugstrength = drugstrength;
	}

	public Manufacturer getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}


}
