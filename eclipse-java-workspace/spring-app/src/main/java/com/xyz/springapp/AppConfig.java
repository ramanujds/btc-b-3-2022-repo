package com.xyz.springapp;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("application.properties")
public class AppConfig {

//	@Bean(name="connection")
//	public InternetConnection getInternetConnectionBean() {
//		InternetConnection connection = new InternetConnection();
//		connection.setProvider("ACT Fibernet");
//		return connection;
//	}
////	
//	@Bean(name = "laptop")
//	public Laptop getLaptopBean() {
//		Laptop laptop = new Laptop();
//		laptop.setConnection(getInternetConnectionBean());
//		laptop.setBrand("Apple");
//		laptop.setModel("MacBook Air M2");
//		laptop.setOs("MacOS");
//		laptop.setRam(16);
//		return laptop;
//	}
	
	@Bean(name = "scanner")
	public Scanner getScannerBean() {
		return new Scanner(System.in);
	}
	
	
}
