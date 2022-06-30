package com.springboot.app.repository;

import com.springboot.app.model.Person;

public interface IPersonRepo {

	public Person addPerson(Person person);
	
	public Person searchPerson(String personName);
	
}
