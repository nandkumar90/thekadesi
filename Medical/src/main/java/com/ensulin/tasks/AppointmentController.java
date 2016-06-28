package com.ensulin.tasks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ensulin.models.dao.PatientDAO;

@Controller
@RequestMapping("/app")
public class AppointmentController {
	
/*private AppointmentDAO appoinmentService;
    
    @Autowired(required=true)
    @Qualifier(value="apointmentDAO")
    public void setAppointmentService(ApppointmentDAO ps){
        this.appointmentService = ps;
    }
    
 */   
	
	private static final Logger logger = LoggerFactory.getLogger(AppointmentController.class);
	
	@RequestMapping(method=RequestMethod.GET)
	public String appointmentHome(){
		logger.info("Appointment Home ");
		//patient.save();
		return "app";
	}
    
    
}
