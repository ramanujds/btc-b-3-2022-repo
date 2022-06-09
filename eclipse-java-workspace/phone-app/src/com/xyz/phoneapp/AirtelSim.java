package com.xyz.phoneapp;

public class AirtelSim implements Sim {

	public void call(long phoneNo) {
		System.out.println("Calling : "+phoneNo);
	}
	
	public void sendSms(String text, long phoneNo) {
			System.out.println("Sending ["+text+"] to "+phoneNo);
	}
	
}
