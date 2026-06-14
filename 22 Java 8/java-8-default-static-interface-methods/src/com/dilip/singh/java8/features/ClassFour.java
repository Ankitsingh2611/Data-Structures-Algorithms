package com.dilip.singh.java8.features;

public class ClassFour implements InterfaceOne, InterfaceTwo {

	@Override
	public void printNames() {
		System.out.println("This is ClassThree: printNames");
	}

	@Override
	public String getNames() {
		
		InterfaceOne.staticMethodOne();
		System.out.println("This is ClassThree: getNames");
		return "This is ClassThree: getNames";
	}

	@Override
	public void defaultMethodFive() {
		// TODO Auto-generated method stub
		InterfaceOne.super.defaultMethodFive();
	}
	

}
