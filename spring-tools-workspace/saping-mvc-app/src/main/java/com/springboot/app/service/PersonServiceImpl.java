package com.springboot.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.app.model.Person;
import com.springboot.app.repository.IPersonRepo;

@Service
public class PersonServiceImpl implements IPErsonService {
	
	@Autowired
	private IPersonRepo repo;

	@Override
	public Person addPerson(Person person) {
		return repo.addPerson(person);
	}
	
	@Override
	public Person searchPerson(String personName) {
		return repo.searchPerson(personName);
	}
}
