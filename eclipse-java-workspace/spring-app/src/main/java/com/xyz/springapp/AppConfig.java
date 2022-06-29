package com.xyz.springapp;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {

//	@Bean(name="connection")
//	public InternetConnection getInternetConnectionBean() {
//		return new InternetConnection();
//	}
//	
//	@Bean(name = "laptop")
//	public Laptop getLaptopBean() {
//		Laptop laptop = new Laptop();
//		laptop.setConnection(getInternetConnectionBean());
//		return laptop;
//	}
	
	@Bean(name = "scanner")
	public Scanner getScannerBean() {
		return new Scanner(System.in);
	}
	
	
}
