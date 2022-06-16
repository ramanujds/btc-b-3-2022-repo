package com.xyz.multithreading;

class PayTm {
	float balance = 100;

	synchronized void recharge(float amount) {
		System.out.println("Trying to recharge");
		if(balance<amount) {
			System.out.println("Insufficient Balance..");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		balance -= amount;
		System.out.println("Recharge Successful");
	}

	synchronized void addMoney(float amount) {
		balance += amount;
		System.out.println("Money Added.. Wallet Balance : " + balance);
		notify();
	}

}

public class InterThreadCommunication {
	public static void main(String[] args) {
		
		PayTm paytm = new PayTm();
		
		Thread t1 = new Thread(()->paytm.recharge(50));
		Thread t2 = new Thread(()->paytm.addMoney(1000));
		
		t1.start();
		
		t2.start();
		
	}

}
