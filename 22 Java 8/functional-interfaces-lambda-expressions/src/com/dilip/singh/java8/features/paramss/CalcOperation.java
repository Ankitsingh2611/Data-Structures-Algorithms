package com.dilip.singh.java8.features.paramss;

@FunctionalInterface
public interface CalcOperation {
	
	double operation(int  a, int b);

	default void printInfo() {
		System.out.println("This Default Data.. of Method");
	}
	
	static void typeOfOperations() {
		System.out.println("Static  Contemnt : Airthmatic Operations");
	}

}
