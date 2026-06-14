package com.dilip.singh.java8.features;

public class ClassThree implements InterfaceOne,InterfaceTwo{

	@Override
	public void printNames() {
		System.out.println("printNames of ClassThree");
		
	}

	@Override
	public String getNames() {
		System.out.println("getNames of ClassThree");
		return null;
	}

	@Override
	public void defaultMethodFive() {
		
		InterfaceOne.super.defaultMethodFive();
		InterfaceTwo.super.defaultMethodFive();
	}

}
