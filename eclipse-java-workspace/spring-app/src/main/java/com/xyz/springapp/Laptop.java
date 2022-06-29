package com.xyz.springapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Laptop {

	@Autowired
	InternetConnection connection;
	
	@Value("${laptop.brand}")
	private String brand;
	@Value("${laptop.model}")
	private String model;
	@Value("${laptop.os}")
	private String os;
	@Value("${laptop.ram}")
	private int ram; 
	
	
	
	
//	public InternetConnection getConnection() {
//		return connection;
//	}
//
//	public void setConnection(InternetConnection connection) {
//		this.connection = connection;
//	}

	public InternetConnection getConnection() {
		return connection;
	}

	public void setConnection(InternetConnection connection) {
		this.connection = connection;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public void connectInternet() {
		connection.connect();
	}
	
	public void joinZoomMeeting() {
		connection.joinMeeting();
	}

	public void showLaptopInfo() {
		System.out.println(this);
	}
	
	@Override
	public String toString() {
		return "Laptop [connection=" + connection.getProvider() + ", brand=" + brand + ", model=" + model + ", os=" + os + ", ram="
				+ ram + "]";
	}
	
	
}
