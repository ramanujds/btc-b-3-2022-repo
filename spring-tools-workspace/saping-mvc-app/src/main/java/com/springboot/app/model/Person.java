package com.springboot.app.model;

public class Person {

	private String personName;
	private String city;
	private String age;
	
	public Person() {
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [personName=" + personName + ", city=" + city + ", age=" + age + "]";
	}
	
	
	
}
