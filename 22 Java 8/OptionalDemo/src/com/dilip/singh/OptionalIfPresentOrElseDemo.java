package com.dilip.singh;

import java.util.Optional;

import javax.xml.validation.Validator;

public class OptionalIfPresentOrElseDemo {

	public static void main(String[] args) {


		//ifPresent()
		
		Optional<String> nameContainer = getName();
		
		nameContainer.ifPresent(val ->{
			//Logic
			System.out.println(val.toUpperCase());
		});
		
		//ifPresentOrElse()
		nameContainer.ifPresentOrElse(
				//When Value is existed 
				(val) -> {
					System.out.println("Value Presented, So converting to Upper Case ");
					System.out.println(val.toUpperCase());
				},
				
				//2nd Param:  Default Logic
				() ->{
					//Logic
					System.out.println("Value Not Presented, SO I am just returning default value");
				}
			);

	}
	
	public static Optional<String> getName() {

		// Returning a value
		// Keep the actual inside Optional Object. Container Object
		String name = "Dilip Singh";
		
		Optional<String> value = null;
		if(name == null) {
			 value = Optional.empty();
		}else {
			value = Optional.of(name);
		}
		return value;
	}

}
