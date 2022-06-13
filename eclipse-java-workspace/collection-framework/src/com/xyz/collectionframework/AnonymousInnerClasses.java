package com.xyz.collectionframework;

interface Printable{
	public void print();
}

//class Printer implements Printable{
//	@Override
//	public void print() {
//		System.out.println("Hello Sir...The document is getting printed..");
//	}
//}

public class AnonymousInnerClasses {

	public static void main(String[] args) {
//		Printable printer = new Printable() {
//			public void print() {
//				System.out.println("Hello Sir...The document is getting printed..");
//			}
//		};
		
		Printable printer = ()-> System.out.println("Hello Sir...The document is getting printed..");
		
		printer.print();
	}
	
}
