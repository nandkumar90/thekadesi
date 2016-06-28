package com.ensulin.models.mysql.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ensulin.models.dao.WardDAO;
import com.ensulin.models.dto.Bed;
import com.ensulin.models.dto.Doctor;

public class WardDAOImpl implements WardDAO {
	private static final Logger logger = LoggerFactory.getLogger(WardDAOImpl.class);
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
	@Override
	public boolean allocation(Bed _bed) {
		try {
			Session session = this.sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			session.persist(_bed);
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
	public boolean deallocation(Bed _bed) {
		try {
			Session session = this.sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			session.delete(_bed);
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
	public boolean changebedstatus(Bed _bed) {
		// TODO Auto-generated method stub
		try {
			Session session = this.sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			//check for  patient id blank whenever  status chnage setParameter("patient Id", "");
			session.update(_bed);
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
	public List<Bed> getAllBedDetail() {
		try {
			Session session = this.sessionFactory.openSession();
			List<Bed> bedList = session.createQuery("from bed").list();
			session.close();
			return bedList;
		} catch (HibernateException e) {
			logger.info(e.getMessage());
			e.printStackTrace();
		}
		return null;
	}

}
