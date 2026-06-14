package com.dilip.singh.java8.features.paramss;

public class FinctionalInterfaceWithPramsDemo {

	public static void main(String[] args) {

		CalcOperation addition = (int x, int y) -> {
			System.out.println("Values are : " + x + " ,  " + y);
			return x + y;
		};
		
		CalcOperation subtraction = (p, q) -> {
			System.out.println();
			return p - q;
		};
		
		CalcOperation multiplication = (p,q) -> p*q;

		//1st Lambda Expression... Execution 
		double result = addition.operation(30, 20);
		System.out.println(result);

		//2nd Lambda Expression.
		result = subtraction.operation(100, 50);
		System.out.println(result);
		
		//3rd Lambda Expression
		result = multiplication.operation(10, 20);
		System.out.println(result);
		
		//execute default methods 
		multiplication.printInfo();
		
		//static method our FI
		CalcOperation.typeOfOperations();
		
	}
}
