package com.springboot.app.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Repository;

import com.springboot.app.model.Person;

@Repository
public class PersonRepoImpl implements IPersonRepo, InitializingBean {
	
	private Map<String, Person> personList;
	
	@Override
	public void afterPropertiesSet() throws Exception {
		personList = new HashMap<>();
	}

	@Override
	public Person addPerson(Person person) {
		this.personList.put(person.getPersonName(), person);
		return person;
	}
	
	public Person searchPerson(String personName) {
		return this.personList.get(personName);
	};
	
}
