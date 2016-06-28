package com.ensulin.models.mysql.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.ensulin.models.dao.DoctorDAO;
import com.ensulin.models.dto.Doctor;

@Repository
public class DoctorDAOImpl implements DoctorDAO {
	
	private static final Logger logger = LoggerFactory.getLogger(PatientDAOImpl.class);
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

	@Override
	public boolean save(Doctor _doctor) {
		try {
			Session session = this.sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			session.persist(_doctor);
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
	public boolean delete(Doctor _doctor) {
		try {
			Session session = this.sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			session.delete(_doctor);
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

	@SuppressWarnings("unchecked")
	@Override
	public List<Doctor> getAll() {
		try {
			Session session = this.sessionFactory.openSession();
			List<Doctor> personList = session.createQuery("from Doctor").list();
			session.close();
			return personList;
		} catch (HibernateException e) {
			logger.info(e.getMessage());
			e.printStackTrace();
		}
		return null;
	}

}
