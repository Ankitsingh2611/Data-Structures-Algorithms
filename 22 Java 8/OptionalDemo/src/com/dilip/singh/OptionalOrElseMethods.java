package com.dilip.singh;

import java.util.Optional;

public class OptionalOrElseMethods {

	public static void main(String[] args) {

		Optional<String> nameContainer = getName();

		// Or()
		// If value is Presented , returns same Optional Object value
		// If Value is Not Presented,
		// then Supplier Functionality will produce another Optional with value.

		String result = nameContainer.or(() -> {
			return Optional.of("Java Optional or method Value");
		}).get();

		System.out.println(result);

		// orElse()
		// If value presented, return that value
		// If Value not presented, we can configure another value and that will be
		// returned

		result = nameContainer.orElse("This is Or else method value");
		System.out.println(result);

		// orElseGet()

		result = nameContainer.orElseGet(

				// Supplier : returning different values at different times.
				() -> {
					// Logic
					return "This orElseGet Value";
				});
		System.out.println(result);

		// orElseThrow()

		// If a value is present, returns the value,
		// otherwise throws NoSuchElementException.
		//result = nameContainer.orElseThrow();
		System.out.println(result);

		// orElseThrow with Supplier
		try {
			nameContainer.orElseThrow(() ->
			{
				return new Exception("This is Exception, NO Value");
			});
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public static Optional<String> getName() {

		// Returning a value

		// Keep the actual inside Optional Object. Container Object

		String name = null;

		Optional<String> value = null;
		if (name == null) {
			value = Optional.empty();
		} else {
			value = Optional.of(name);
		}
		return value;
	}

}
