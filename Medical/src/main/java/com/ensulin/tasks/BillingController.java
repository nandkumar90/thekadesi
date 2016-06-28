package com.ensulin.tasks;	

import java.util.LinkedHashSet;
import java.util.Set;

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

import com.ensulin.models.dao.BillDAO;
import com.ensulin.models.dto.InternalBill;
import com.ensulin.models.dto.Items;

@Controller
@RequestMapping("/billing")
public class BillingController {
    //billing can be done for Medicine , Appointment, Ward Allotment, Blood Bank
	private static final Logger logger = LoggerFactory.getLogger(BillingController.class);
	private BillDAO billService;
	Set<Items> billableItems = new LinkedHashSet<Items>();

	@Autowired(required=true)
	@Qualifier(value="billDAO")
	public void setBillService(BillDAO bs){
		this.billService = bs;
	}
	
	 
		@RequestMapping(method=RequestMethod.GET)
		public String newBill(){
			//@PathVariable("id")String id, Model model
			//model.addAttribute("bill",new Bill());
			return "prescribedbill2";
		}
	
	/*
	 * This will ceate a new Bill object with the billService
	 
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public String newBill(@PathVariable("id")String id, Model model){
		model.addAttribute("bill",new Bill());
		return "billHome";
	}
	
	
	 * This will pass the json data to service
	 * Service Will parse and create Bill object
	 * And save it in database.
	 
	
	//at this time bill status also be set 
	@RequestMapping(value="/{id}", method=RequestMethod.POST)
	public String addBill(@PathVariable("id")Bill bill, Model model){
		logger.info("Adding Bill "+ bill.toString());
		if(billService.save(bill)){
			return "redirect:/billing/billHome";
		}
		else return "error";
	}
	
    
	//this will call when, bill will not paid fully   
	@Transactional
	@RequestMapping(value="/{id}", method=RequestMethod.POST)
	public String  deleteTemproaryBill(@PathVariable("id")long  billid){
		if(billService.delete(billid)){
			return "redirect:/billing/billHome";
		}
		else return "error";

	}

	// display bill detail on basis on billId
	@Transactional
	@RequestMapping(value="/{id}", method=RequestMethod.POST)
	public  String displayBillDetail(@PathVariable("id")long billid, Model model){
		Bill  bill=billService.displayBillDetaill(billid);
		if(bill != null){
			model.addAttribute("bill", bill);
			return "redirect:/billing/billDetail";
		}
		else return "error";
	}
	
	
	 * Get a JSON object of Item as bill
	 * Let the Bill Service use the Item Service to create Item
	 * Make a Bill Item and add it.
	 
	
	@Transactional
	public boolean addItemToBill( Items item){
		billableItems.add(item);
		return true;
	}
	
	//it will resume bill from tempbill table
	//bill status also be set at this moment
	@Transactional
	public  String resumeBill(long billId, Model model)
	{
		
		Bill  bill=billService.getBillDetaillFromTemp(billId);
		if(bill != null){
			model.addAttribute("bill", bill);
			return "redirect:/billing/billDetail";
		}
		else return "error";
	}*/

}