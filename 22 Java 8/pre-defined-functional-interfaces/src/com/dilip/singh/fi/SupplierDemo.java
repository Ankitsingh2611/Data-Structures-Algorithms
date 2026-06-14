package com.dilip.singh.fi;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {

		// Get Date and time always
		Supplier<LocalDateTime> dateTime = () -> LocalDateTime.now();

		/*
		 * System.out.println(dateTime.get());
		 * 
		 * System.out.println(dateTime.get());
		 */

		printCurrentTimeNow(dateTime);

	}

	public static void printCurrentTimeNow(Supplier<LocalDateTime> dateTime) {

		System.out.println(dateTime.get());
	}

}
