package com.xyz.springapp;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	
//    	Laptop myLaptop = context.getBean(Laptop.class);
//    	
//        myLaptop.connectInternet();
//        myLaptop.joinZoomMeeting();
//        myLaptop.setRam(16);
//        
//        myLaptop.showLaptopInfo();
//        
//        Laptop myLaptop2 = context.getBean(Laptop.class);
//        
//        myLaptop2.showLaptopInfo();
//        
//        Laptop myLaptop3 = context.getBean(Laptop.class);
//        
//        myLaptop3.showLaptopInfo();
        
        
//        Scanner scan = context.getBean(Scanner.class);
        
//        System.out.println("Enter a value:");
//        String value = scan.nextLine();
//        System.out.println(value);
//        

    }
}
