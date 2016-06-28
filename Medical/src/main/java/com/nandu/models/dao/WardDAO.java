package com.nandu.models.dao;

import java.util.List;
import java.util.Set;

import com.nandu.Ward.Bed;
public interface WardDAO {
	public boolean save(Bed _bed);
	public boolean save(Set<Bed> _bed);


	public boolean delete(Bed _bed);

	public List<Bed> getAll();
	

}
