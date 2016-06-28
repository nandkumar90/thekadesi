package com.ensulin.models.mysql.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ensulin.models.dao.BillDAO;
import com.ensulin.models.dto.InternalBill;

public class BillDAOimpl implements BillDAO {

	private static final Logger logger = LoggerFactory
			.getLogger(BillDAOimpl.class);
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public boolean save(InternalBill _bill) {
		try {
			Session session = this.sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			session.persist(_bill);
			tx.commit();
			session.close();
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			logger.info(e.getMessage());
			e.printStackTrace();
		}
		return false;

	}

	
	//need to see how to imple 
		@Override
		public boolean savetemp(InternalBill _bill) {
			try {
				Session session = this.sessionFactory.openSession();
				Transaction tx = session.beginTransaction();
				session.persist(_bill);
				tx.commit();
				session.close();
				return true;
			} catch (HibernateException e) {
				// TODO Auto-generated catch block
				logger.info(e.getMessage());
				e.printStackTrace();
			}
			return false;
		}

		
	@Override
	public boolean delete(long _billid) {
		try {
			Session session = this.sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			session.delete(_billid);
			tx.commit();
			session.close();
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<InternalBill> getAll() {
		try {
			Session session = this.sessionFactory.openSession();
			List<InternalBill> BillList = session.createQuery("from Bill").list();
			session.close();
			return BillList;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<InternalBill> getByDate(Date date) {
		try {
			Session session = this.sessionFactory.openSession();
			List<InternalBill> BillList = session.createQuery("from Bill where billDate=date").list();
			session.close();
			return BillList;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<InternalBill> getByPatientName(String Name) {
		try {
			Session session = this.sessionFactory.openSession();
			List<InternalBill> BillList = session.createQuery("from Bill where Person.username=Name").list();
			session.close();
			return BillList;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	//List<Bill> BillList = session.createQuery("from Bill where billDate=date").list();

	@Override
	public List<InternalBill> getByMobileNo(int mobileNo) {
		try {
			Session session = this.sessionFactory.openSession();
			List<InternalBill> BillList = session.createQuery("from Bill where Person.mobileNumber=mobileNo").list();
			session.close();
			return BillList;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	
	}

	@Override
	public InternalBill displayBillDetaill(long billId) {
		try {
			Session session = this.sessionFactory.openSession();
			InternalBill bill = (InternalBill) session.createQuery("from Bill where bill.billid=billId");
			session.close();
			return bill;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public InternalBill getBillDetaillFromTemp(long billId) {
		try {
			Session session = this.sessionFactory.openSession();
			InternalBill bill = (InternalBill) session.createQuery("from tembill where tempbill.billid=billId");
			session.close();
			return bill;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	

	
	
}