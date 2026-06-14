package com.dilip.singh;

import java.util.Optional;

public class UpperCaseValues {

	public static void main(String[] args) {

		Optional<String> nameConatiner = getName(); // method class : getting 100% non-null value

		if (nameConatiner.isPresent()) {
			String name = nameConatiner.get();
			name = name.toUpperCase();
			System.out.println(name);
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
		
		
		
		Optional<String> value = Optional.of(name);
		
		
		return value;
	}

}
