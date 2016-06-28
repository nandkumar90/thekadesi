package com.ensulin.tasks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ensulin.models.dto.Doctor;
@Controller
@RequestMapping("/Reception")
public class ReceptionController {

	private static final Logger logger = LoggerFactory.getLogger(HospitalController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String doctorHome( Doctor doctor){
		logger.info("Reception Home ");
		//patient.save();
		return "receptionHome";
	}

}
