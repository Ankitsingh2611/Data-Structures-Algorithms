package com.dilip.singh.method.references;

import java.util.Arrays;

public class MethodReferencesDemoTwo {

	public static void main(String[] args) {
		
		//Static Methods : Class Name
		//EmployeeValidation validEmployee = Employee::validateEmpDetails;
		
		//Non-Static Methods : Instance Name
		//Create Instance for the class where the method is located
		Employee e = new Employee();
		EmployeeValidation validEmployee = e::validateEmpDetails;
		
		// Validating Employee Details 
		Employee emp1 = new Employee();
		System.out.println(validEmployee.isValidEmployee(emp1));  // false
		
		Employee emp2 = new Employee();
		emp2.setId(123);
		emp2.setName("Dilip Singh");
		emp2.setSalary(50000);
		System.out.println(validEmployee.isValidEmployee(emp2));  // true
		
		//access instance methods with class name also
		EmployeeValidation salaryValidation = Employee::validSalary;
		System.out.println(salaryValidation.isValidEmployee(emp2));

		
		//Array of String Values
		String[] values = {"Dilip","Java", "Spring", "Methods", "References"};
		

		//Arrays.sort(values, (o1,o2) -> o1.compareToIgnoreCase(o2));
		Arrays.sort(values, String::compareToIgnoreCase);

		for(String str : values )
			System.out.println(str);
		

		
		

	}

}
