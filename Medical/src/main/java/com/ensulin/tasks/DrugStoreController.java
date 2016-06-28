package com.ensulin.tasks;

import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ensulin.models.dao.DrugDAO;
import com.ensulin.models.dto.DrugItems;

@Controller
@RequestMapping("/drugstore")
public class DrugStoreController {
	private static final Logger logger = LoggerFactory.getLogger(DrugStoreController.class);
	private DrugDAO drugstoreService;
    
	@Autowired(required = true)
	@Qualifier(value = "drugDAO")
	public void setPersonService(DrugDAO ds) {
		this.drugstoreService = ds;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String drugStoreHome() {
		List<DrugItems> drug = drugstoreService.getAll();
		ModelAndView mv=new ModelAndView();
		mv.addObject("drug", drug);
		logger.info("Drug Store Home");
		return "drugHome";
	}
//value="/{id}",
	@RequestMapping(method = RequestMethod.GET, value="/{id}")
	public String drugStoreHome(Model model) {
		List<DrugItems> drug = drugstoreService.getAll();
		model.addAttribute("drug", drug);
		logger.info("Drug Store Home");
		return "drugHome";
	}

	

	/*@RequestMapping(method = RequestMethod.GET)
	public String drugStoreHome(Model model) {
		List<DrugStore> drug = drugstoreService.getAll();
		model.addAttribute("drug", drug);
		logger.info("Drug Store Home");
		return "drugHome";
	}
    
	@RequestMapping(method = RequestMethod.POST)
    public String addDrugtoDrugStore(@PathVariable("drug") Set<DrugStore> drug){
		if(drugstoreService.save(drug))
			return "redirect:/drugStore/drugHome";
		else return "error";
		
		}
	
	@RequestMapping(method = RequestMethod.GET, value="/{drugName}")
	public String getDrugDetail(@PathVariable("id")  String  drugName, Model model){
		List<DrugStore> drugList=drugstoreService.getbyName(drugName);
		model.addAttribute("drugList", drugList);
		if (drugList != null)
			return "redirect:/drugStore/drugHome";
		else
			return "error";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/{drugid}")
	public String getDrugDetail(@PathVariable("id") long drug_id, Model model) {
		logger.info("Drug Store Home");
		List<DrugStore> drugList = drugstoreService.getbyId(drug_id);
		model.addAttribute("drugList", drugList);
		if (drugList != null)
			return "redirect:/drugStore/drugHome";
		else
			return "error";
	}

	*/
}
