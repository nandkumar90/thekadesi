package com.theka.controller;

import java.util.LinkedList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.theka.model.Menu;

@RestController
public class LunchController {
	
	@RequestMapping(value="/lunch/menu", method = RequestMethod.GET,produces={"application/json"})
	public @ResponseBody String getmenu() {
		Gson gson = new Gson();
		Menu menu=new Menu();
		LinkedList<String> items=new LinkedList<String>();
		items.add("Rice	Rajma");
		items.add("Paneer Chilly");
		items.add("Aloo Jeera");
		items.add("paratha");
		items.add("Papad");
		items.add("Salad");
		items.add("Achar");
		items.add("Ghee");
		items.add("Fruit");
		items.add("Chaat");
		items.add("Sweet");
		menu.setItems(items);
		String me=gson.toJson(menu);

        System.out.println(me);
	
		return me;
	}
}
