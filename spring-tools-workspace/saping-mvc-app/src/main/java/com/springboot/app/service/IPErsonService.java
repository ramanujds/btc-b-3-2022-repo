package com.springboot.app.service;

import com.springboot.app.model.Person;

public interface IPErsonService {

	public Person addPerson(Person person);
	
	public Person searchPerson(String personName);
	
}
