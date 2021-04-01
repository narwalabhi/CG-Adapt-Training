package com.assignment6.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.assignment6.controllers, com.assignment6.services")
@EnableAutoConfiguration
public class CalculatorApp {
	
	public static void main(String[] args) {
		SpringApplication.run(CalculatorApp.class, args);
	}
}
