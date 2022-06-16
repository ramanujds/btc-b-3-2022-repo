package com.xyz.multithreading;

class PrintTable{
	public void printTable(int n) {
		for(int i=1; i<=10; i++) {
			if(i==5 && Thread.currentThread().getName().equals("thread1")) {
				try {
					
					Thread.currentThread().join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(i+" x "+n+" = "+(n*i));
		}
	}
}

public class ThreadsExample {

	public static void main(String[] args) {
		PrintTable obj = new PrintTable();

		Runnable r1 = ()->{
			obj.printTable(5);
		};
		
		Runnable r2 = ()->{
			obj.printTable(10);
		};
		
		Runnable r3 = ()->{
			obj.printTable(7);;
			
		};
		
		var th1 =new Thread(r1);
		th1.setName("thread1");
		var th2 = new Thread(r2);
		var th3 = new Thread(r3);
		
		th1.start();
		th2.start();
		th3.start();
		
		

	}

}
