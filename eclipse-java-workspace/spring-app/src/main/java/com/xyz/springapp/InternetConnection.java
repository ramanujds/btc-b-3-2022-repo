package com.xyz.springapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class InternetConnection {

	@Value("${connection.provider}")
	private String provider;
	
	
	
	
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
