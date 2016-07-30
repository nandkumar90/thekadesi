package com.theka.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LunchController {
	
	@RequestMapping(value="/lunch/menu", method = RequestMethod.GET)
	public @ResponseBody String getmenu() {
		
		return "item1: Rice	Rajma,	item2: Paneer Chilly, item3: 	Aloo Jeera,item4: 	paratha,item5: 	Papad (Lijjat), item 6: 	Salad,item7: 	Achar,	item8:Ghee,	item9: Fruit,item10:  Chaat,item11: Sweet";
	}
	
}
