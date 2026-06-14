package com.dilip.singh.fi;

public class Employee {

	private int id;
	private String name;
	private double salary;
	private String gender;
	
	
	@Override
	public boolean equals(Object obj) {
			Employee e = (Employee) obj;

		return this.getId()== e.getId();
	}


	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
