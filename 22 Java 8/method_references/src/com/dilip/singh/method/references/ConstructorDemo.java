package com.dilip.singh.method.references;

public class ConstructorDemo {

	public static void main(String[] args) {

		// Employee e = new Employee();
		GetEmployeeInstance employee = Employee::new;
		Employee emp = employee.getEmployee(111);



	}

}
