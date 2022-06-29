package com.xyz.springapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
//@Lazy
public class InternetConnection {

	@Value("${connection.provider}")
	private String provider;
	
	public InternetConnection() {
		System.out.println("InternetConnetion Object is Created");
	}
	
	
	
	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public void connect() {
		System.out.println("Connected to Internet | Provider : "+provider);
	}
	
	public void joinMeeting() {
		System.out.println("Joining Meeting..");
	}
	
}
