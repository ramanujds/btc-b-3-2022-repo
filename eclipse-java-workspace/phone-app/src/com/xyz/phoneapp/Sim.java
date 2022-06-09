package com.xyz.phoneapp;

public interface Sim {

	void call(long phoneNo);
	
	void sendSms(String text, long phoneNo) ;
}
