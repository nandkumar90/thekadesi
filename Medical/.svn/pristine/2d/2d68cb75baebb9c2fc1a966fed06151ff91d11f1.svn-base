package com.ensulin.tasks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ensulin.models.dao.DoctorDAO;

@Controller
@RequestMapping("/login")
public class UserLoginController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserLoginController.class);
	//private DoctorDAO doctorService;
    
  /*  @Autowired(required=true)
    @Qualifier(value="doctorDAO")
    public void setLoginService(DoctorDAO ps){
        this.loginService = ps;
    }*/

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(method=RequestMethod.GET)
	public String loginHome(){
		logger.info("Doctor Home ");
		//patient.save();
		return "login";
	}

}
