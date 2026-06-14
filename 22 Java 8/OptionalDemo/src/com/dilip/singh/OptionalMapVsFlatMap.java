package com.dilip.singh;

import java.util.Optional;

public class OptionalMapVsFlatMap {

	public static void main(String[] args) {

		Optional<String> nameContainer = Optional.of("Dilip Singh");

		// Upper case of Value : map

		String result = nameContainer.map(val -> val.toUpperCase()).get();

		System.out.println(result);

		// Nested Optional Object
		Optional<Optional<String>> nameContainer2 = Optional.of(Optional.of("Dilip Singh"));

		Optional<String> nestedOptObj = nameContainer2.map(val -> val.get());

		result = nestedOptObj.map(val -> val.toUpperCase()).get();
		
		System.out.println(result);
		
		//flatMap
		Optional<Optional<String>> nameContainer3 = Optional.of(Optional.of(("Dilip Singh")));

		result = nameContainer3.flatMap( value -> value ).get().toUpperCase();
		System.out.println(result);	

	}

}
