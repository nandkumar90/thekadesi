package com.ensulin.tasks;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.ensulin.models.dao.WardDAO;
import com.ensulin.models.dto.Bed;

@Controller
@RequestMapping("/ward")
public class WardController {
	private static final Logger logger = LoggerFactory.getLogger(WardController.class);
	private WardDAO wardService;
/*
	@Autowired(required = true)
	@Qualifier(value = "billDAO")
	public void setWardService(WardDAO ws) {
		this.wardService = ws;
	}
*//*
	@Transactional
	@RequestMapping(method = RequestMethod.POST)
	public String allocateBed(Bed bed) {
		logger.info("Ward Allocation ");
		if (wardService.allocation(bed)) {
			return "redirect:/ward/wardHome";
		} else
			return "error";
	}

	@Transactional
	@RequestMapping(method = RequestMethod.POST)
	public String deallocateBed(Bed bed) {
		logger.info("Ward Allocation ");
		if (wardService.deallocation(bed)) {
			return "redirect:/ward/wardHome";
		} else
			return "error";
	}

	@Transactional
	@RequestMapping(method = RequestMethod.POST)
	public String getAllBedDetail(Model model ) {
		logger.info("Listing all beds in ward ");
	     List<Bed> allBeds= wardService.getAllBedDetail();
		  model.addAttribute("allbed", allBeds);
		if (!allBeds.isEmpty()) {
			return "redirect:/ward/wardHome";
		} else
			return "error";
	}

	@Transactional
	@RequestMapping(method = RequestMethod.POST)
	public String changeStatusOfBed(Bed bed) {
		logger.info("set Bed status from working to repair and vice-versa  ");
		if (wardService.changebedstatus(bed)) {
			return "redirect:/ward/wardMaintaince";
		} else
			return "error";
	}
*/
}
