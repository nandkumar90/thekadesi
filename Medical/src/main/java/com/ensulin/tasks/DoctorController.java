package com.ensulin.tasks;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ensulin.models.dao.DoctorDAO;
import com.ensulin.models.dto.Doctor;

@Controller
@RequestMapping("/doctor")
public class DoctorController {
	
	private static final Logger logger = LoggerFactory.getLogger(DoctorController.class);
	private DoctorDAO doctorService;
    
    @Autowired(required=true)
    @Qualifier(value="doctorDAO")
    public void setPersonService(DoctorDAO ps){
        this.doctorService = ps;
    }

	/**
	 * Simply selects the home view to render by returning its name.
	 */
   //@RequestMapping(value="/{id}",method=RequestMethod.GET)
    @RequestMapping(method=RequestMethod.GET)
	public String doctorHome(){
		logger.info("Doctor Home ");
		//patient.save();
		return "ePrescription";
	}
	
	@RequestMapping(method = RequestMethod.GET, params="new")
	public String displayPtientRegistration(Model model) {

		model.addAttribute("doctor",new Doctor());

		return "newDoctor";
	}
	
/*	@Transactional
	@RequestMapping(method = RequestMethod.POST)
	public String savePatientData(Doctor doctor){
		logger.info("Adding patient "+ doctor.toString());
		if(doctorService.save(doctor))
			return "redirect:/patient/"+doctor.getUsername();
		
		return "error";
	}*/

}
