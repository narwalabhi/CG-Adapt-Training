package com.narwal.assignment.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hellocontroller {

	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello World";
	}
	
}
