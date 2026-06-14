package com.dilip.it.academy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamInitilization {

	public static void main(String[] args) {

		// 1. From Collection Object
		List<String> values = List.of("One", "Two", "Three");
		Stream<String> stream1 = values.stream();

		// Arrays of Values
		String[] names = { "One", "Two", "Three" };
		Stream<String> stream2 = Arrays.stream(names);

		// Stream Methods
		Stream<String> stream3 = Stream.of("One", "Two", "Three");

		// generate()
		Stream<String> stream4 = Stream.generate(() -> "One");

		// builder()
		// Builder Design Pattern
		Stream.Builder<String> streamBuilder = Stream.builder();
		Stream<String> stream5 = streamBuilder.add("One").add("Two").add("Three").build();

		// Empty Stream
		// empty()
		Stream<String> stream6 = Stream.empty();

	}

}
