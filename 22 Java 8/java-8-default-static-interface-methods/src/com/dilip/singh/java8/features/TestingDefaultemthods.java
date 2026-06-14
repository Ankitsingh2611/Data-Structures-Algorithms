package com.dilip.singh.java8.features;

public class TestingDefaultemthods {
	public static void main(String[] args) {
		ClassOne one = new ClassOne();
		//accessing default methods 
		one.defaultMethodOne();
		
		
		ClassThree three= new ClassThree();
		
		//InterfaceOne Methods 
		three.defaultMethodOne();
		three.defaultMethodTwo();
		
		//InterfaceTwo method 
		three.defaultMethodThree();
		
		three.defaultMethodFive();
		
		// Accessing Static Methods 
		System.out.println("Accessing Static Methods");
		ClassFour four = new ClassFour();
		InterfaceOne.staticMethodOne();
		InterfaceOne.staticMethodTwo();
		
	}
}
