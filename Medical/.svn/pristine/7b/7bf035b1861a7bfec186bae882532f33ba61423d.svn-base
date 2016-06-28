package com.ensulin.tasks;

import java.io.IOException;
import java.io.StringWriter;

import javax.transaction.Transactional;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.hibernate.HibernateException;
import org.hibernate.exception.ConstraintViolationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ensulin.models.dao.PatientDAO;
import com.ensulin.models.dto.OutputObject;
import com.ensulin.models.dto.Patient;

@RestController
public class PatientController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	private PatientDAO patientService;
	private static ObjectMapper mapper = new ObjectMapper();
	
	@Autowired(required=true)
	@Qualifier(value="patientDAO")
	public void setPersonService(PatientDAO ps){
		this.patientService = ps;
	}

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	//check  for  get and post
	@RequestMapping(value="/patient/{id}",
			method=RequestMethod.GET)
	public String addPatient( @PathVariable("id")String id){
		logger.info("Patient Home ");
		//patient.save();
		return "patientHome";
	}

	@Transactional
	@POST
	@RequestMapping(value="/patient",method = RequestMethod.POST)
	@ResponseStatus(value=HttpStatus.CREATED)
	public @ResponseBody OutputObject savePatientData(String postData) throws Exception{
		Patient patient = null;
		try{
			if((patient = patientService.save(postData))!=null)
				return new OutputObject(OutputObject.TYPE_CREATE, 
						patient, OutputObject.STATUS_OK);
		}
		catch(ConstraintViolationException e){
			System.out.println("Exception is "+e.getMessage());
			return new OutputObject(OutputObject.TYPE_CREATE, 
					"UserName already exists", OutputObject.STATUS_FAIL);
		}
		catch (HibernateException e) {
			// TODO Auto-generated catch block
			logger.info(e.getMessage());
			return new OutputObject(OutputObject.TYPE_CREATE, 
					e.getMessage(), OutputObject.STATUS_FAIL);
		}
		catch(Exception e){
			return new OutputObject(OutputObject.TYPE_CREATE, 
					e.getMessage(), OutputObject.STATUS_FAIL);
		}
		return new OutputObject(OutputObject.TYPE_CREATE, 
				"Unknown Error Occured, Verify JSON object structure", OutputObject.STATUS_FAIL);
	}
	
	@RequestMapping(value="/patient/search/id/{id}",method=RequestMethod.GET,headers = {"Accept=text/xml, application/json"})
	public @ResponseBody OutputObject searchPatientById(@PathVariable String id){
		String p = "";
		if((p = patientService.getById(id))!=null)
			return new OutputObject(OutputObject.TYPE_SEARCH, 
					p, OutputObject.STATUS_OK);
		return new OutputObject(OutputObject.TYPE_SEARCH, 
				"", OutputObject.STATUS_FAIL);
	}
	
	@RequestMapping(value="/patient/search/email/{email}",method=RequestMethod.GET,headers = {"Accept=text/xml, application/json"})
	@Produces({"application/json"})
	public @ResponseBody OutputObject searchPatientByEmail(@PathVariable String email)throws Exception{
		String p = "";
		if((p = patientService.getByEmail(email))!=null){
			ObjectMapper om = new ObjectMapper();
			StringWriter str=new StringWriter();
			om.writeValue(str, p);
			return new OutputObject(OutputObject.TYPE_SEARCH, 
					str.toString(), OutputObject.STATUS_OK);
		}
		return new OutputObject(OutputObject.TYPE_SEARCH, 
				"", OutputObject.STATUS_FAIL);
	}

	@RequestMapping(value="/patient/search/phone/{phone}",method=RequestMethod.GET,headers = {"Accept=text/xml, application/json"})
	public @ResponseBody OutputObject searchPatientByPhone(@PathVariable String phone)throws Exception{
		Patient p = null;
		if((p = patientService.getByMobile(phone))!=null){
			ObjectMapper om = new ObjectMapper();
			StringWriter str=new StringWriter();
			om.writeValue(str, p);
			System.out.println("Controller new "+str.toString());
			return new OutputObject(OutputObject.TYPE_SEARCH, 
					p, OutputObject.STATUS_OK);
		}
		return new OutputObject(OutputObject.TYPE_SEARCH, 
				"", OutputObject.STATUS_FAIL);
	}
	
}
