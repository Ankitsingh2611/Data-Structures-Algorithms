package com.dilip.singh;

import java.util.Optional;

public class OptionalFilterMethod {

	public static void main(String[] args) {
		Optional<String> nameContainer = getName();

		Optional<String> verifiedCOntainer = nameContainer.filter(
				// Predicate
				val -> val.equalsIgnoreCase("Dilip Singh")
		).or(
				() -> Optional.of("Dilip Singh of or method")
			
				);
		
		System.out.println(verifiedCOntainer.get());
	}

	public static Optional<String> getName() {

		// Returning a value
		// Keep the actual inside Optional Object. Container Object

		String name = "Dilip Singh";

		Optional<String> value = null;
		if (name == null) {
			value = Optional.empty();
		} else {
			value = Optional.of(name);
		}
		return value;
	}

}
