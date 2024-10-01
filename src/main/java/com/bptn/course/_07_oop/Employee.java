package com.bptn.course._07_oop;

public class Employee {
	// instance variables
	private String name;
	private int employeeId;
	private int age;
	
	//constructors
	
	//default constructor
	public Employee() {
		this.name= "Ruth";
		this.employeeId = 100;
		this.age = 20;
	}
	
	//parameterized constructor - with 2 parameters
	//instance variable name and parameter name can have the same name
	//instance variable can be distinguished using this.varaibleName
	public Employee(String name, int employeeId) {
		this.name = name;
		this.employeeId = employeeId;
	}
	//parameterized constructor - with 3 parameters
	public Employee(String name, int employeeId, int age) {
		this.name = name;
		this.employeeId = employeeId;
		this.age = age;
	}
	
	//methods
	public void printInfo() {
		System.out.println("Employee name: "+ this.name + " EmployeeId: " + this.employeeId + " age: " + this.age);
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.printInfo();
		
		Employee e2 = new Employee("John Doe", 1234);
		e2.printInfo();
		
		Employee e3 = new Employee("Jane Smith", 5678, 30);
		e3.printInfo();
	}

}
