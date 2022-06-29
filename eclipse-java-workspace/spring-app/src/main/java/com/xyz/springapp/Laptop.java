package com.xyz.springapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {

	@Autowired
	InternetConnection connection;
	
	
//	public InternetConnection getConnection() {
//		return connection;
//	}
//
//	public void setConnection(InternetConnection connection) {
//		this.connection = connection;
//	}

	public void connectInternet() {
		connection.connect();
	}
	
	public void joinZoomMeeting() {
		connection.joinMeeting();
	}
	
	
}
