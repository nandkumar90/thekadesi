package com.theka.service;

import java.util.List;

import com.theka.model.FeedBack;
import com.theka.model.Person;

public interface PersonService {

	public void addPerson(Person p);
	public void addfeedback(FeedBack p);
	public void updatePerson(Person p);
	public List<Person> listPersons();
	public Person getPersonById(int id);
	public void removePerson(int id);
	
}
