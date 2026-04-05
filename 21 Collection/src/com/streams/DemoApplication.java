package com.streams;

import java.util.*;
import java.util.stream.Collectors;

public class DemoApplication {
    static List<Employee> employees = Arrays.asList(
            new Employee(1, "Abraham", 29, "IT", "Mumbai", 20000, "Male"),
            new Employee(2, "Mary", 27, "Sales", "Chennai", 25000, "Female"),
            new Employee(3, "Joe", 28, "IT", "Chennai", 22000, "Male"),
            new Employee(4, "John", 29, "Sales", "Gurgaon", 29000, "Male"),
            new Employee(5, "Liza", 25, "Sales", "Bangalore", 32000, "Female"),
            new Employee(6, "Peter", 27, "Admin", "Mumbai", 31500, "Male"),
            new Employee(7, "Harry", 30, "Research", "Kochi", 21000, "Male")
    );

    public static void main(String[] args) {

        //Find list of employees whose name starts with alphabet A
        List<Employee> employeeWithA = employees.stream().filter(emp -> emp.getName().startsWith("A")).collect(Collectors.toList());
        System.out.println("Employees whose name starts with A \n" + employeeWithA);

        //Group The employees By Department Names
        Map<String, List<Employee>> deptWithEmployee = employees.stream().collect(Collectors.groupingBy(Employee::getDepartNames));
        System.out.println("Group employees by department names \n"+deptWithEmployee);

        //Find the total count of employees using stream
        long count = employees.stream().count();
        System.out.println("Total Number of employees " + count);

        //Find the max age of employees
        int age = employees.stream().mapToInt(Employee -> Employee.getAge()).max().getAsInt();
        System.out.println("Maximum age of employee "+ age);

        //Find all department names
        Set<String> allDepartmentNames = employees.stream().map(Employee::getDepartNames).collect(Collectors.toSet());
        System.out.println("Name of all department "+ allDepartmentNames);

        //Find the count of employee in each department
        Map<String, Long> employeeCountByDepartment = employees.stream().collect(Collectors.groupingBy(Employee::getDepartNames, Collectors.counting()));
        System.out.println(employeeCountByDepartment);

        //Find the list of employees whose age is less than 30
        List<Employee> ageLessThan30 = employees.stream().filter(emp -> emp.getAge() < 30).collect(Collectors.toList());
        System.out.println(ageLessThan30);

        //Find the list of employees whose age is in between 26 and 31
        List<Employee> ageBetween26And30 = employees.stream().filter(emp -> emp.getAge() < 30 && emp.getAge() > 26).collect(Collectors.toList());
        System.out.println(ageBetween26And30);

        //Find the average age of male and female employee
        Map<String, Double> avgAgeOfMaleAndFemale = employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
        System.out.println("Average age of male & female "+ avgAgeOfMaleAndFemale);

        //Find the department who is having maximum number of employee
        Map.Entry<String, Long> deptMaxcount = employees.stream().collect(Collectors.groupingBy(Employee::getDepartNames, Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println("Department having maximum number of employees " + deptMaxcount);

        //Find the Employee who stays in Delhi and sort them by their names
        List<Employee> chennaiEmployee = employees.stream().filter(emp -> emp.getAddress().equals("Chennai")).sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
        System.out.println("Employee staying in Chnnai and sorted by their names " + chennaiEmployee);

        //Find the average salary in all departments
        Map<String, Double> avgSalForEachDept = employees.stream().collect(Collectors.groupingBy(Employee::getDepartNames, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println("Average salary of each department " + avgSalForEachDept);

        //Find the highest salary in each department
        Map<String, Optional<Employee>> highestSalForEachDedpt = employees.stream().collect(Collectors.groupingBy(Employee::getDepartNames, Collectors.minBy(Comparator.comparing(Employee::getSalary))));
        System.out.println(highestSalForEachDedpt);

        //Find the list of employee and sort them by their salary
        List<Employee> employeesWithSortedSalary = employees.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());
        System.out.println(employeesWithSortedSalary);

        //Find the employee who has second lowest salary
        Employee withSecondHighestSalary = employees.stream().sorted(Comparator.comparing(Employee::getSalary)).skip(1).findFirst().get();
        System.out.println(withSecondHighestSalary);
    }

}
