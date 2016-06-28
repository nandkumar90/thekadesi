package com.ensulin.models.dao;

import java.util.List;
import java.util.Set;

import com.ensulin.models.dto.Doctor;
import com.ensulin.models.dto.Drug;
import com.ensulin.models.dto.DrugItems;

public interface DrugDAO {
//	public boolean save(List<Drug> _drug);
	public boolean save(Set<DrugItems> drugStore);

//	public boolean delete(DrugStore _drugstore);

	public List<DrugItems> getAll();
	
	public List<DrugItems> getbyId(long _drugid);
	public List<DrugItems> getbyName(String _name);
	public List<DrugItems> getbyStrength(int _strength);
	public List<DrugItems> getbySalt(String _salt);

}
