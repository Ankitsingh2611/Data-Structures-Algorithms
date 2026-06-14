package com.dilip.singh.method.references;

public class MethodReferencesDemo {

	public static void main(String[] args) {

		//Lambda Exp. Impl. of abstract method 
		
		ConvertToUpperCase  toUpperCase = (value) -> {
			System.out.println("In ISde LAmbda : converting value to Upper Case");
			return value.toUpperCase();
		};
		
		System.out.println(toUpperCase.convertToUppercase("Java MEthod References"));
		
		//Method References		
		// Re -Using/executing a pre defined method from String class
		// assigning that method reference of class 
		ConvertToUpperCase upperCaseTwo = String::toUpperCase;
		System.out.println(upperCaseTwo.convertToUppercase("Java MEthod References"));
		
	}

}
