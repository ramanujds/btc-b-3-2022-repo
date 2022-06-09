package com.xyz.bookstore.model;

public class Author {
	
	private String name;
	private String country;
	
	public Author() {
		// TODO Auto-generated constructor stub
	}
	

	public Author(String name, String country) {
		super();
		this.name = name;
		this.country = country;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}



	@Override
	public String toString() {
		return "Author [name=" + name + ", country=" + country + "]";
	}
	
	
	

}
