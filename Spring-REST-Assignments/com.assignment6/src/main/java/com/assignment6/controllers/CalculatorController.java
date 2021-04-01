package com.assignment6.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment6.services.CalculatorService;

@RestController
public class CalculatorController {

	@Autowired
	CalculatorService CalculatorService;

	@RequestMapping("/add/{a}/{b}")
	public double add(@PathVariable("a") double a, @PathVariable("b") double b) {
		return CalculatorService.add(a, b);
	}

	@RequestMapping("/subtract/{a}/{b}")
	public double subtract(@PathVariable("a") double a, @PathVariable("b") double b) {
		return CalculatorService.subtract(a, b);
	}

	@RequestMapping("/multiply/{a}/{b}")
	public double multiply(@PathVariable("a") double a, @PathVariable("b") double b) {
		return CalculatorService.multiplication(a, b);
	}

	@RequestMapping("/divide/{a}/{b}")
	public double divide(@PathVariable("a") double a, @PathVariable("b") double b) {
		return CalculatorService.division(a, b);
	}

	@RequestMapping("/sqrt/{a}")
	public double sqrt(@PathVariable("a") double a) {
		
		return CalculatorService.squarRoot(a);
	}
}
