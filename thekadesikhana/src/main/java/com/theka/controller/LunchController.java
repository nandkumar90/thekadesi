package com.theka.controller;

import java.sql.Time;
import java.util.Date;
import java.util.LinkedList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.theka.model.LunchBooking;
import com.theka.model.Menu;

@RestController
public class LunchController {

	@RequestMapping(value = "/lunch/menu", method = RequestMethod.GET, produces = { "application/json" })
	public @ResponseBody String getmenu() {
		Gson gson = new Gson();
		Menu menu = new Menu();
		LinkedList<String> items = new LinkedList<String>();
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
		String me = gson.toJson(menu);

		System.out.println(me);

		return me;
	}

	// for taking lunch booking parameters as form urm parameter
	@RequestMapping(value = "/lunch/booking", method = RequestMethod.POST, produces = { "application/json" })
	public @ResponseBody String lunchBooking(
			@RequestParam(value = "email") String email,
			@RequestParam(value = "phoneno") String phoneno,
			@RequestParam(value = "nooflunchbox") int nooflunchbox,
			@RequestParam(value = "location") String location,
			@RequestParam(value = "deliveryTime") String deliveryTime) {
		Gson gson = new Gson();
//		String test = "email " + email + "  " + "phoneno  " + phoneno + "   "
//				+ "nooflunchbox   " + nooflunchbox + "   location" + location
//				+ "   deliveryTime " + deliveryTime;
		LunchBooking lunchBooking = new LunchBooking();
		lunchBooking.setDeliveryLocation(location);
		lunchBooking.setDeliveryTime(deliveryTime);
		lunchBooking.setPhoneNo(phoneno);
		lunchBooking.setEmailId(email);
		int orderId = (int) Math.random();
		lunchBooking.setOrderId(orderId);
		String booking = gson.toJson(lunchBooking);

		return booking;
	}

	// for taking lunch booking parametes as a Lunchbooking object
	@RequestMapping(value = "/lunch/delivery", method = RequestMethod.POST, produces = { "application/json" })
	public @ResponseBody String lunchDelivery(LunchBooking lunchBooking) {
		// extract expectedDeliveryDate, excpectedDeliveryTime from deliverytime
		// and set using setter;
		Gson gson = new Gson();
//		String test = "email " + lunchBooking.getEmailId() + "  " + "phoneno  "
//				+ lunchBooking.getPhoneNo() + "   " + "nooflunchbox   "
//				+ lunchBooking.getNoofTiffin() + "   location"
//				+ lunchBooking.getDeliveryLocation() + "  deliverytime "
//				+ lunchBooking.getDeliveryTime();
		int orderId = (int) Math.random();
		lunchBooking.setOrderId(orderId);
		String Booking = gson.toJson(lunchBooking);
		return Booking.toString();
	}

}
