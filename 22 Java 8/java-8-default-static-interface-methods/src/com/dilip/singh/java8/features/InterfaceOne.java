package com.dilip.singh.java8.features;

public interface InterfaceOne {

	//Abstract methods/ Non-Implemented methods 
	void printNames();
	String getNames();
	
	//How to create default methods 
	default void defaultMethodOne() {
		System.out.println("InSide InterfaceOne defaultMethodOne.. ");
	 }
	
	default String defaultMethodTwo() {
		System.out.println("InSide InterfaceOne defaultMethodTwo.. ");
		return "defaultMethodTwo";
	 }
	
	default void defaultMethodFive() {
		System.out.println("InSide InterfaceOne defaultMethodFive.. ");
	 }
	
	 //static methods
	static String staticMethodOne() {
		System.out.println("This is staticMethodOne");
		return "This is static method";
	}
	
	static void staticMethodTwo() {
		System.out.println("This is staticMethodTwo");
	}
	
}
