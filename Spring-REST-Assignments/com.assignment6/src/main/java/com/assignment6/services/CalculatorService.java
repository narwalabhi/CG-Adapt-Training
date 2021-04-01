package com.assignment6.services;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

	public double add(double a, double b) {
		return a+b;
	}
	
	public double subtract(double a, double b) {
		return a-b;
	}

	public double multiplication(double a, double b) {
		return a*b;
	}
	
	public double division(double a, double b) {
		return a/b;
	}
	
	public double squarRoot(double a) {
		return Math.sqrt(a);
	}
}
