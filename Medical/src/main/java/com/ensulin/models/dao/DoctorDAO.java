package com.ensulin.models.dao;

import java.util.List;

import com.ensulin.models.dto.Doctor;

public interface DoctorDAO {

	public boolean save(Doctor _doctor);

	public boolean delete(Doctor _doctor);

	public List<Doctor> getAll();
}
