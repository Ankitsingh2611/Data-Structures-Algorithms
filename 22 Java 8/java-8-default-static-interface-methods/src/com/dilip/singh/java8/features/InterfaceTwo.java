package com.dilip.singh.java8.features;

public interface InterfaceTwo {
	
	default void defaultMethodThree() {
		
		System.out.println("Inside InterfaceTwo : defaultMethodThree... ");
	}
	
	default void defaultMethodFive() {
		System.out.println("InSide InterfaceTwo defaultMethodFive.. ");
	 }
	

	static void staticMethodTwo() {
		System.out.println("This is staticMethodTwo");
	}
	
}
