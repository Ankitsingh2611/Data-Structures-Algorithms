package com.dilip.singh.java8.features;


@FunctionalInterface
public interface Calculate {
	
	// 1: ONly ONe abstract method
	void printName();
	
	// N : default methods 
	default void methodOne() {
		System.out.println("this is default method one");
	}
	
	default void methodTwo() {
		System.out.println("this is default method Two");
	}
	
	static void methodStaticOne() {
		System.out.println("this is static method one");
	}
	
	static void methodStaticTwo() {
		System.out.println("this is static method Two");
	}
	
	
}
