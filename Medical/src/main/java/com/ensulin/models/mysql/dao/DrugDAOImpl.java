package com.ensulin.models.mysql.dao;

import java.util.List;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ensulin.models.dao.DrugDAO;
import com.ensulin.models.dto.Drug;
import com.ensulin.models.dto.DrugItems;


public class DrugDAOImpl implements DrugDAO {
	private static final Logger logger = LoggerFactory.getLogger(PatientDAOImpl.class);
	private SessionFactory sessionFactory;
	 
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

	@Override
	public List<DrugItems> getAll() {
		try {
			Session session = this.sessionFactory.openSession();
			List<DrugItems> drug=session.createQuery("from drug").list();
		    session.close();
			return drug;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			logger.info(e.getMessage());
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<DrugItems> getbyId(long _drugid) {
		try {
			Session session = this.sessionFactory.openSession();
			List<DrugItems> drug=session.createQuery("from drug where drug.drug_id="+_drugid).list();
		    session.close();
			return drug;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			logger.info(e.getMessage());
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<DrugItems> getbyName(String _name) {
		try {
			Session session = this.sessionFactory.openSession();
			List<DrugItems> drug=session.createQuery("from drug where drug.Name=_name").list();
		    session.close();
			return drug;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			logger.info(e.getMessage());
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<DrugItems> getbyStrength(int _strength) {
		try {
			Session session = this.sessionFactory.openSession();
			List<DrugItems> drug=session.createQuery("from drug where drug.strength=_strength").list();
		    session.close();
			return drug;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			logger.info(e.getMessage());
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<DrugItems> getbySalt(String _salt) {
		
		try {
			Session session = this.sessionFactory.openSession();
			List<DrugItems> drug=session.createQuery("from drug where drug.salt=_salt").list();
		    session.close();
			return drug;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			logger.info(e.getMessage());
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean save(Set<DrugItems> drugItems) {
		try {
			Session session = this.sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			session.persist(drugItems);
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

	/*public boolean save(Set<Drug> _drug) {
		try {
			Session session = this.sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			session.persist(_drug);
			tx.commit();
			session.close();
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			logger.info(e.getMessage());
			e.printStackTrace();
		}
	return false;
	}*/


}
