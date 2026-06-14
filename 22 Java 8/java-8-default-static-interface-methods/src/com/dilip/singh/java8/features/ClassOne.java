package com.dilip.singh.java8.features;

public class ClassOne implements InterfaceOne{

	// Impl. Of Abstarct methods 
	@Override
	public void printNames() {
		System.out.println("printing Names ");
	}

	@Override
	public String getNames() {
		// accessing default method from class own method
		defaultMethodOne();
		System.out.println("getting Names ");
		return "default method";
	}
	
	public void defaultMethodOne() {
		System.out.println("InSide ClassOne defaultMethodOne.. ");
	}
	
}
