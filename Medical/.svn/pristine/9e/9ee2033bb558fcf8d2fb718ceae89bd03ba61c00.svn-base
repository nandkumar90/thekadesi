package com.ensulin.tasks;

import java.util.LinkedHashSet;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ensulin.models.dao.BillDAO;
import com.ensulin.models.dto.Items;

@Controller
@RequestMapping("/admin")
public class AdminController {
	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);
	//private AdminDAO adminService;
	//Set<Items> billableItems = new LinkedHashSet<Items>();

	/*@Autowired(required=true)
	@Qualifier(value="billDAO")
	public void setBillService(BillDAO bs){
		this.billService = bs;
	}*/
	
	 
		@RequestMapping(method=RequestMethod.GET)
		public String adminHome(){
			//@PathVariable("id")String id, Model model
			//model.addAttribute("bill",new Bill());
			return "admin";
		}

}
