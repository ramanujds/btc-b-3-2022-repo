package com.xyz.springapp;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	Laptop myLaptop = context.getBean(Laptop.class);
    	
        myLaptop.connectInternet();
        myLaptop.joinZoomMeeting();
        
        Scanner scan = context.getBean(Scanner.class);
        
        System.out.println("Enter a value:");
        String value = scan.nextLine();
        System.out.println(value);
        

    }
}
