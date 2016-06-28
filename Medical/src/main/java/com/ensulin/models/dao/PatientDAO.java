package com.ensulin.models.dao;

import java.util.List;




import com.ensulin.models.dto.Patient;

public interface PatientDAO {

	public Patient save(String patientData);

	public boolean delete(Patient _patient);

	public List<Patient> getAll();

	public String getById(String id);
	
	public String getByEmail(String id);
	
	public Patient getByMobile(String id);
}
