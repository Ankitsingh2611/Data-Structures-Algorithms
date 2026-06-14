package com.dilip.singh.fi;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {

		// Req: age > 21 years
		Predicate<Integer> ageCheck = age -> age > 21;

		System.out.println(ageCheck.test(32)); // true
		System.out.println(ageCheck.test(18)); // false

		if (ageCheck.test(44)) {
			System.out.println("Eligible");
		}

		// Employee Object : find out salary > 25000
		Employee e1 = new Employee();
		e1.setId(111);
		e1.setSalary(24000);

		Predicate<Employee> empSalaryCheck = emp -> emp.getSalary() > 25000;

		if (empSalaryCheck.test(e1)) {
			System.out.println("Above 250000");
		} else {
			System.out.println("Below 25000");
		}

		// Salary > 25000 and Employee gender is FEMALE
		Predicate<Employee> femaleCheck = emp -> emp.getGender().equalsIgnoreCase("female");
		e1.setGender("FEMALE");

		boolean result = empSalaryCheck.and(femaleCheck).test(e1);
		System.out.println(result);

		// Salary > 25000 or Gender is Male
		result = empSalaryCheck.or(femaleCheck).test(e1);
		System.out.println(result);

		// negate()
		result = femaleCheck.negate().test(e1);
		System.out.println(result);
		
		
		//Req :  Employee: Have to validate other employees. 
		// Employee : equals method. 
		
		Predicate<Employee>  baseEmp = Predicate.isEqual(e1);
		
		// Employee Object : find out salary > 25000
				Employee e2 = new Employee();
				e2.setId(111);
				e2.setSalary(25000);
				  result = baseEmp.test(e2);
				  System.out.println(result);
		

	}

}
