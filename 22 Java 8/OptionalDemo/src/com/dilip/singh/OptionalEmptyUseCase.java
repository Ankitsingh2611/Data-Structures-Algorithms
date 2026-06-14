package com.dilip.singh;

import java.util.Optional;

public class OptionalEmptyUseCase {

	public static void main(String[] args) {

		Optional<String> nameConatiner = getName(); // method class : getting 100% non-null value

		if (nameConatiner.isPresent()) {   // Value is presented or not: 
			String name = nameConatiner.get();
			name = name.toUpperCase();
			System.out.println(name);
		}else {
			System.out.println("Value is Not Avilable");
		}
		
		if(nameConatiner.isEmpty()) {  // Is Conatiner is empty 
			System.out.println("Yes, Empty");
		}else {
			System.out.println(nameConatiner.get().toUpperCase());
		}

		/*
		 * if (name != null) {
		 * 
		 * name = name.toUpperCase(); }
		 * 
		 * System.out.println(name);
		 */

	}

	public static Optional<String> getName() {

		// Returning a value

		// Keep the actual inside Optional Object. Container Object

		String name = null;
		
		Optional<String> value = null;
		if(name == null) {
			 value = Optional.empty();
		}else {
			value = Optional.of(name);
		}
		return value;
	}

}
