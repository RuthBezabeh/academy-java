package com.bptn.course._08_polymorphism;

//parent class
class Shape{
	void drawAngle() {
		System.out.println("Drawing a shape angle");
	}
}

//sub-class Rectangle
class Rectangle extends Shape{
	@Override
	void drawAngle() {
		System.out.println("Drawing a rectangle");
	}
}
public class Polymorphism2 {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.drawAngle();
	}
}

//1. create a parent class called Shape
//2. create one sub-class called Rectangle
//3. create a method called drawAngle() in the Shape class and override it in the Rectangle class

//we can ony have 1 public class in a single file