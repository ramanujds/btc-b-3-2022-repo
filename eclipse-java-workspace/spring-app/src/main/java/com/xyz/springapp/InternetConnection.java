package com.xyz.springapp;

import org.springframework.stereotype.Component;

@Component
public class InternetConnection {

	
	
	public void connect() {
		System.out.println("Connected to Internet");
	}
	
	public void joinMeeting() {
		System.out.println("Joining Meeting..");
	}
	
}
