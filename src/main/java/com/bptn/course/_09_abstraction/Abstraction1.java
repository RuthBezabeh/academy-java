package com.bptn.course._09_abstraction;

//Abstraction using an abstract class
//Abstract class - a class that cannot be instantiated / used to create objects
//can have abstract or non abstract method

abstract class Shape{
	//abstract method - no implementation
	abstract void draw();
	
	abstract void print();
	
	//normal methods - which has implementation
	void moveTo(int x, int y) {
		System.out.println("Move to: " + x + y);
	}
}

//subclass extends shape class
class Circle extends Shape{

	@Override
	void draw() {
		System.out.println("Draw a circle");
		
	}

	@Override
	void print() {
		System.out.println("print a circle");
	}
	
}

//subclass extends shape class
class Rectangle extends Shape{

	@Override
	void draw() {
		System.out.println("Draw a rectangle");
		
	}

	@Override
	void print() {
		System.out.println("print a rectangle");
	}
	
}

public class Abstraction1 {

	public static void main(String[] args) {
		// creat eobjects from Circle class
		Circle c1 = new Circle();
		c1.draw();
		c1.print();
		
		c1.moveTo(2,3); // this is an inherited method from shape class
		
		Rectangle r1 = new Rectangle();
		r1.draw();
		r1.print();
		
		r1.moveTo(20, 40);
		
		
	}

}

//major takeaways
//1. Abstract class - it's a class that connot be instantiated
//2. It contains abstract methods and normal methods
//3. the sub class is goingt to implement the abstract methods from the abstract class
//4. whan a sub class implements the abstract methods fromthe abstract class it should follow the rules of overriding