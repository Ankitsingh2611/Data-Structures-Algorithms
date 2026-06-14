package com.dilip.singh.java8.features;

public class ClassTwo implements InterfaceOne {

	@Override
	public void printNames() {
		System.out.println("In ClassTwo : printNames");
		
	}

	@Override
	public String getNames() {
		System.out.println("In ClassTwo : getNames");
		return "class Two";
	}
}
