package com.dilip.it.academy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperations {

	public static void main(String[] args) {

		List<Employee> employees = employeesList();

		// Stream Methods / Operations

		// Req : Get all employee names as list

		List<String> empNames = new ArrayList<String>();
		for (Employee emp : employees) {
			empNames.add(emp.getName());
		}
		System.out.println(empNames);

		// With Stream
		Stream<Employee> employeesStream = employees.stream();

		// Stream Pipeline
		List<String> allemployeeNames = employeesStream.map(emp -> emp.getName()) // Intermediate Operation
				.toList(); // Terminal Operation
		System.out.println(allemployeeNames);

		// filter()
		// Employee Names , Age > 25
		List<String> empNames2 = employees.stream() // Stream Object
				.filter(emp -> emp.getAge() > 25) // Intermediate Operation
				.map(emp -> emp.getName()) // Intermediate Operation
				.toList(); // Terminal Operation
		System.out.println(empNames2);

		// Print all city names of employees

		// distinct()
		// forEach() :
		employees.stream() // Stream Object
				.map(emp -> emp.getCity()) // Intermediate Operation
				.distinct() // Intermediate Operation
				.forEach(System.out::println);

		// Get Count of employees whose salary is > 20K
		// count()
		long countOfEmp = employees.stream().filter(emp -> emp.getSalary() > 20000).count();

		System.out.println(countOfEmp);

		// limit()
		// Get first 3 employee objects as a list
		List<Employee> first3Employees = employees.stream().limit(3)
				// Intermediate Operations
				.toList();

		System.out.println(first3Employees);

		// skip()
		// skip first 3 employees and I want to collect others employees Data
		List<Employee> exceptfirst3Employees = employees.stream().skip(3) // exclude 3 employee Objects from the list of
																			// Objects inside Stream and
																			// Process other Objects and creates new
																			// Stream Object
				.toList();
		System.out.println(exceptfirst3Employees);

		// anyMatch()
		// Verify any emp < 28
		boolean isUnderAge = employees.stream().anyMatch(emp -> emp.getAge() < 28);
		System.out.println(isUnderAge);

		// allMatch()
		// Check very employee joined after 2010 or not.
		boolean result = employees.stream().allMatch(emp -> emp.getYearOfJoining() > 2010);
		System.out.println(result);

		// any one matching : false
		// no one matching : true
		// noneMatch()

		// every employee salary under < 10000
		result = employees.stream().noneMatch(emp -> emp.getSalary() < 10000);

		System.out.println(result);

		// findAny()
		// get One value from out of all values
		Employee emp = employees.stream() // Employee Objects Stream
				.findAny().get();
		System.out.println(emp);

		// findFirst()
		// It will always return first element of the Stream
		emp = employees.stream() // Employee Objects Stream
				.findFirst().get();
		System.out.println(emp);

		// sorted()
		// Get Employee Id's in sorted Order

		List<Integer> sortedEmpIds = employees.stream() // Stream of Employee Objects
				.map(employee -> employee.getId()) // Stream of Employee ID values : Integer

				// 6, 7,8,3
				.sorted()
				// 1,2,3,4,5..10
				.toList();
		System.out.println(sortedEmpIds);

		// sorted : Comparator Arg.

		// Define Sorting based on employee Id's
		// Sort Employee Objects

		// Comparator
		List<Employee> sortedEmpObjects = employees.stream().sorted((e1, e2) -> {
			return e1.getId() - e2.getId();
		}).toList();

		System.out.println(sortedEmpObjects);

		// minimum salary employee details

		Employee minSalaryEmp = employees.stream().min((e1, e2) -> (int) (e1.getSalary() - e2.getSalary())).get();

		System.out.println(minSalaryEmp);

		// Maximum salary Employee Details
		// max()
		Employee maxSalaryEmp = employees.stream().max((e1, e2) -> (int) (e1.getSalary() - e2.getSalary())).get();
		System.out.println(maxSalaryEmp);

		// average()
		// average salary of employees
		// DoubleStream : Stream contains only double value
		double avgSalary = employees.stream().mapToDouble(employee -> employee.getSalary()).average().getAsDouble();

		System.out.println(avgSalary);

		// mapToInt : IntegerStream

		// avg age of emp

		// IntStream
		double avgAge = employees.stream().mapToInt(employee -> employee.getAge()).average().getAsDouble();

		System.out.println(avgAge);

		// mapToLong : LongStream
		
		
		//peek()
		//Out of all employees, find whose date of joining > 2015 
		// Track How many Employees are processed. 
		
		System.out.println("*********** Peek Method **********");
	List<Employee>	empDetails = employees.stream() // 10 Employees Objects 
			.peek(System.out::println)
					.filter(employee -> employee.getYearOfJoining() > 2015) //  2 joined > 2015
					.toList();
	
	System.out.println(empDetails);
	
	
	System.out.println("****** Parallel Stream ***");
	
	empDetails = employees.parallelStream() // 10 Employees Objects 
			.peek(System.out::println)
					.filter(employee -> employee.getYearOfJoining() > 2015) //  2 joined > 2015
					.toList();
	
	System.out.println(empDetails);
	
		
	
	//collect()
	//Collectors : JDK8 , as part of Stream API operations
	
	
	// Collect All EMployees Names as a LISt, whose age is greater than 25
	List<String> names = 	 employees.stream().filter(employee -> employee.getAge() > 25)
					.map(Employee::getName)
					.collect(Collectors.toList());
	
	System.out.println(names);
	
	//Unique Department names 
	Set<String> departments =  employees.stream().map(Employee::getDepartment)
	  .collect(Collectors.toSet());
	
	System.out.println(departments);
	
	//collect employee IDs and their salaries as Map
	 Map<Integer, Double>  empIdAndSalaries = 
			 employees.stream().collect(Collectors.toMap(Employee::getId, 
			
			  Employee::getSalary));
	 
	 System.out.println(empIdAndSalaries);
	 
	 //groupingBy()
	 // get avg salary of each department
	 Map<String, Double>  avgSalaryDeptWise = employees.stream().collect(Collectors.groupingBy( 
			 
			 Employee::getDepartment,
			 Collectors.averagingDouble(Employee::getSalary)
			 
			 ));
	 
	 System.out.println(avgSalaryDeptWise);
	 
	 
	 //count()
	 // Get Count of employees gender wise 
	 Map<String, Long> countOfEmpGenderWise = employees.stream().collect(Collectors.groupingBy(
			 	
			 	Employee::getGender ,
			 	Collectors.counting()
			 
			 )
		 
			 );
	System.out.println(countOfEmpGenderWise); 
	
	//summing...
	//summarizing...
	
	// Summing All employees salaries 
	System.out.println(employees.stream()
			.collect(Collectors.summingDouble(Employee::getSalary)));
	System.out.println(employees.stream()
			.collect(Collectors.summarizingDouble(Employee::getSalary)));
	
	
	// maxBy()

	//finding max age of employees
	Employee maxAgeEmp = employees.stream()
			.collect(Collectors.maxBy((e1,e2) -> e1.getAge() - e2.getAge()))
			.get();
	
	
	System.out.println(maxAgeEmp);
	
	//joining
	// All Department names with delimiter :::
String allDeparments =	employees.stream().map(Employee::getDepartment).collect(Collectors.joining(":::"));
	
	System.out.println(allDeparments);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
		

	}

	public static List<Employee> employeesList() {

		List<Employee> employeeList = new ArrayList<>();

		employeeList.add(new Employee(6, "Six", 43, "Male", "Security", 2016, 9500.0, "Pune"));
		employeeList.add(new Employee(7, "Seven", 35, "Male", "Finance", 2010, 27000.0, "Pune"));
		employeeList.add(new Employee(3, "Three", 29, "Male", "Infrastructure", 2012, 18000.0, "Hyderabad"));
		employeeList.add(new Employee(8, "Eight", 31, "Male", "Development", 2015, 34500.0, "Pune"));
		employeeList.add(new Employee(9, "Nine", 24, "Female", "Sales", 2016, 11500.0, "Hyderabad"));
		employeeList.add(new Employee(10, "Ten", 25, "Female", "Sales", 2009, 22500.0, "Pune"));
		employeeList.add(new Employee(2, "Two", 25, "Male", "Sales", 2015, 13500.0, "Hyderabad"));
		employeeList.add(new Employee(4, "Four", 28, "Female", "Development", 2014, 32500.0, "Pune"));
		employeeList.add(new Employee(5, "Five", 27, "Female", "HR", 2013, 22700.0, "Pune"));
		employeeList.add(new Employee(1, "One", 32, "Female", "HR", 2011, 25000.0, "Hyderabad"));

		return employeeList;
	}

}
