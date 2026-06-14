package com.dilip.singh.java8.features;

public class Demo {

	public static void main(String[] args) {

		// Interface can refer impl. class Instance
		Calculate calc = new Camel();
		calc.printName();

		// Lambda Expression
		Calculate Abc = () -> {
			System.out.println("This is Abc Comapny");
		};
		

		// Lambda Expression Implementations
		Calculate xyz = () -> {
			System.out.println("This is XYZ Comapny");
		};
		
		Abc.printName();
		xyz.printName();

	}

}
