package com.bptn.course._08_polymorphism;

public class Polymorphism3 {

	void print(int integer) {
		System.out.println("Printing an integer: " + integer);
	}
	void print(String s) {
		System.out.println("Printing a string: " + s);
	}
	int print(int a, int b) {
		return a+b;
	}
	double print(double a, double b) {
		return a+b;
	}
	public static void main(String[] args) {
		Polymorphism3 p1 = new Polymorphism3();
		p1.print(5);
		
		p1.print("Hello World");

	}

}

//major key takeaways
//method overloading - compile time polymorphism
//1. it occurs within the same class and no inheritance is required
//2. method names should be the same
//3. It can have different return type and number of parameters
//4. it can have different type of parameters
//5. static methods can be overloaded