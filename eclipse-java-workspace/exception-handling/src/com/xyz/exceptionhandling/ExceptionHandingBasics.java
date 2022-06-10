package com.xyz.exceptionhandling;

public class ExceptionHandingBasics {

	public static void main(String[] args) {
		
//		int num1 = 10;
//		int num2 = 2;
//		
//		System.out.println("Hello..");
//		System.out.println("Divinding "+num1+ " by "+num2);
//		try {
//			int result = num1/num2;
//			System.out.println("Output : "+result);
//		}
//		catch (ArithmeticException ex) {
//			System.err.println(ex);
//		}
//		System.out.println("Operation Completed");
//		// some important statements
//		// .....
//		System.out.println("Bye");
		
		
		String str = null;
		
		if(str!=null) {
			System.out.println(str.length());
		}
		else {
			System.out.println("String is null");
		}
		

	}

}
