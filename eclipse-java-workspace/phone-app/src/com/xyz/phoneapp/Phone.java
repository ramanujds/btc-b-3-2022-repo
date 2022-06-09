package com.xyz.phoneapp;

public class Phone {

	Sim sim;
	
	public void inserSim(Sim sim) {
		this.sim=sim;
	}
	
	public void makeACall(long phoneNo) {
		sim.call(phoneNo);
	}
	
	public void sendText(String msg, long phnoneNo) {
		sim.sendSms(msg, phnoneNo);
	}
	
	public void showSimInfo(){
		System.out.println("Sim - "+sim.getClass().getSimpleName());
	}
		
	
}
