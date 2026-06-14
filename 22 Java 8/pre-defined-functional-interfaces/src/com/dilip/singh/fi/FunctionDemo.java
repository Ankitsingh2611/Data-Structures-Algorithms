package com.dilip.singh.fi;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionDemo {

	public static void main(String[] args) {

		// Req : Find half value from given value
		Function<Integer, Double> halfVale = i -> i / 2.0;

		Double result = halfVale.apply(10);
		System.out.println(result);

		// Req : Given String should be converted to Upper case
		Function<String, String> func1ToUppercase = String::toUpperCase;

		System.out.println(func1ToUppercase.apply("Dilip Singh"));
		System.out.println(func1ToUppercase.apply("Java Features"));

		// Null check
		Function<String, String> func2nullCheck = str -> str == null ? "Enter Valid Value" : str;

		String value = func2nullCheck.andThen(func1ToUppercase).apply(null);
		System.out.println(value);

		System.out.println("This is Functionality of Compose");
		value = func2nullCheck.compose(func1ToUppercase).apply("This Is Compose");
		System.out.println(value);

		// static identity()
		Function<Integer, Integer> identicalValue = Function.identity();
		System.out.println(identicalValue.apply(100));

		// Stream API :
		// Stream Object : From that i have to collect all values as a List.
		Stream<String> names = Stream.of("One", "Two", "three");
		List<String> values = names.map(Function.identity()).collect(Collectors.toList());
		System.out.println(values);
	}

}
