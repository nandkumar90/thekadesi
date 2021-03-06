package com.theka.dao;

import java.util.List;

import com.theka.model.FeedBack;
import com.theka.model.Person;

public interface PersonDAO {

	public void addPerson(Person p);
	public void updatePerson(Person p);
	public List<Person> listPersons();
	public Person getPersonById(int id);
	public void removePerson(int id);
	public void addFeedBack(FeedBack feedBack);
	
}
