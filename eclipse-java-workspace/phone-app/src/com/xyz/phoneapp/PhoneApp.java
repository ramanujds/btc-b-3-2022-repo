package com.xyz.phoneapp;

public class PhoneApp {

	public static void main(String[] args) {
		
		Phone phone = new Phone();
		Sim sim1= new AirtelSim();
		Sim sim2= new JioSim();
		phone.inserSim(sim2);	
		
		phone.makeACall(8877665544L);
		phone.sendText("How are you?", 8877669955L);
		phone.showSimInfo();

	}

}
