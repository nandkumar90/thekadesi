package com.ensulin.models.mysql.dao;

import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.hibernate.exception.ConstraintViolationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.ensulin.models.dao.PatientDAO;
import com.ensulin.models.dto.Patient;

@Repository
public class PatientDAOImpl implements PatientDAO {

	private static final Logger logger = LoggerFactory.getLogger(PatientDAOImpl.class);
	private SessionFactory sessionFactory;
	private static ObjectMapper mapper = new ObjectMapper();
	 
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
	@Override
	public Patient save(String patientData) {
		/*
		 * Check for data validation
		 * Throw Custom Exception
		 */
		Patient patient = null;
		Session session = null;
		try {
			patient = mapper.readValue(patientData, Patient.class);
			logger.info("Adding patient "+ patient.toString());
			session = this.sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			session.persist(patient);
			tx.commit();
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			session.close();
		}
		return patient;
	}

	@Override
	public boolean delete(Patient _patient) {
		try {
			Session session = this.sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			session.delete(_patient);
			tx.commit();
			session.close();
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	public String getById(String id){
		Session session = null;
		System.out.println("Searching patient with ID as "+ id);
		logger.info("Searching patient with ID as "+ id);
		try{
			session = this.sessionFactory.openSession();
			Criteria cr = session.createCriteria(Patient.class);
			cr.add(Restrictions.eq("username", id));
			List results = cr.list();
			if(results.size()>0)
				return mapper.writeValueAsString(results.get(0));
		} catch (JsonGenerationException e) {
			logger.info(e.getMessage());
			e.printStackTrace();
		} catch (JsonMappingException e) {
			logger.info(e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			logger.info(e.getMessage());
			e.printStackTrace();
		}
		finally{
			session.close();
		}
		return null;
	}
	
	public String getByEmail(String id){
		Session session = null;
		System.out.println("Searching patient with ID as "+ id);
		logger.info("Searching patient with ID as "+ id);
		try{
			session = this.sessionFactory.openSession();
			Criteria cr = session.createCriteria(Patient.class);
			cr.add(Restrictions.eq("email", id));
			List results = cr.list();
			if(results.size()>0)
				return mapper.writeValueAsString(results.get(0));
		} catch (JsonGenerationException e) {
			logger.info(e.getMessage());
			e.printStackTrace();
		} catch (JsonMappingException e) {
			logger.info(e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			logger.info(e.getMessage());
			e.printStackTrace();
		}
		finally{
			session.close();
		}
		return null;
	}
	
	public Patient getByMobile(String id){
		Session session = null;
		System.out.println("Searching patient with ID as "+ id);
		logger.info("Searching patient with ID as "+ id);
		try{
			session = this.sessionFactory.openSession();
			Criteria cr = session.createCriteria(Patient.class);
			cr.add(Restrictions.eq("personalDetails.mobileNumber", id));
			List results = cr.list();
			if(results.size()>0){
				return (Patient)results.get(0);
			}
		}
		finally{
			session.close();
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Patient> getAll() {
		try {
			Session session = this.sessionFactory.openSession();
			List<Patient> personList = session.createQuery("from Patient").list();
			session.close();
			return personList;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
