package com.dilip.singh.fi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {

		// List of value : names : abc, xyz, MNo, PQR
		//print all in Upper case
		
		 List<String> names =  List.of("abc","xyz","MNo","pQR");
		 Consumer<String> printInUpperCase = 
				 str -> System.out.println(str.toUpperCase());
		
				 printInUpperCase.accept("Dilip Singh");
				 
		names.forEach(printInUpperCase);
		
		List<String> newValues = new ArrayList<String>();
		
		Consumer<String> addToList = str -> newValues.add(str.toUpperCase());
		
		names.forEach(addToList);
		
		System.out.println(newValues);
		
		
		

	}

}
