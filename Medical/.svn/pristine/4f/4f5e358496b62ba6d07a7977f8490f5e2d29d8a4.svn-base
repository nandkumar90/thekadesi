package com.ensulin.models.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "med_drugstore_manufacturer")
public class Manufacturer {
	@Column(name = "manufacturer_name")
	private String manufacturer_name;
	@Id
	@Column(name = "manufacturer_id")
	private long manufacturer_id;
	@Column(name = "manufacturer_description")
	private String manufacturer_description;
	@Column(name = " manufacturer_rating")
	private int manufacturer_rating;

	public String getManufacturer_name() {
		return manufacturer_name;
	}

	public void setManufacturer_name(String manufacturer_name) {
		this.manufacturer_name = manufacturer_name;
	}

	public long getManufacturer_id() {
		return manufacturer_id;
	}

	public void setManufacturer_id(long manufacturer_id) {
		this.manufacturer_id = manufacturer_id;
	}

	public String getManufacturer_description() {
		return manufacturer_description;
	}

	public void setManufacturer_description(String manufacturer_description) {
		this.manufacturer_description = manufacturer_description;
	}

	public int getManufacturer_rating() {
		return manufacturer_rating;
	}

	public void setManufacturer_rating(int manufacturer_rating) {
		this.manufacturer_rating = manufacturer_rating;
	}

}
