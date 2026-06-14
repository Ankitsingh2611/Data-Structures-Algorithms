package com.dilip.singh.method.references;

public class Employee {

	private int id;
	private String name;
	private String gender;
	private double salary;
	
	Employee(){
		System.out.println("This is Employee Constructor with No Data ");
	}
	
	Employee(int eid, String name){
		System.out.println("This is Employee Constructor with  Data ");
		this.id = eid;
		this.name = name;
	}
	Employee(int eid){
		System.out.println("This is only Id Value initilized");
	}

	// non static/instance method
	 boolean validateEmpDetails(Employee employee) {
		// id and name should be presented
		if (employee.getId() != 0 && employee.getName() != null)
			return true;
		return false;
	}
	 
	 // No Method args
	 boolean validSalary() {
		 return this.getSalary() > 0 ? true :false;
	 }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
