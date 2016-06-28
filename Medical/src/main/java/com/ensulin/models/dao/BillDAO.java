package com.ensulin.models.dao;

import java.util.Date;
import java.util.List;

import com.ensulin.models.dto.InternalBill;
import com.ensulin.models.dto.Person;

public interface BillDAO {
	
	public boolean save(InternalBill _bill);

	public boolean savetemp(InternalBill _bill);
	
	//this only before billing confirmed
	public boolean delete(long _billid);
	
	public List<InternalBill> getAll();
	
	public List<InternalBill> getByDate(Date date );
	
	public List<InternalBill> getByPatientName(String Name);
	
	public List<InternalBill> getByMobileNo(int mobileNo);

	public InternalBill displayBillDetaill(long billId);

	public InternalBill getBillDetaillFromTemp(long billId);


}