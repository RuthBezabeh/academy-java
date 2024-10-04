package com.bptn.course._09_abstraction;

//Abstraction using interface- Before Java 8

interface ShapeInterface{
	
	//Before Java 8- interfaces had only abstract methods and constants
	//lets create some abstract methods
	
	void draw();
	
	double getArea();
}

//to implement the abstract methods from the interface- we need to create a sub-class
class RectangleClass implements ShapeInterface{
	
	private double width;
	private double height;

	@Override
	public void draw() {
		System.out.println("Draw a rectangle");
		
	}

	@Override
	public double getArea() {
		return this.width * this.height;
	}

	
	
	
}

public class Abstraction2 {

	public static void main(String[] args) {
		
		
		//create an object from the RectangleClass
		
		RectangleClass r1= new RectangleClass();
		
		r1.draw(); //it calls the method from RectangleClass 

	}

}

//Interface cannot be instantiated -cannot be used to create objects
//Before Java 8- interfaces had only abstract methods and constants
