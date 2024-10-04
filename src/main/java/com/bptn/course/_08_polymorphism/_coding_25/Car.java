package com.bptn.course._08_polymorphism._coding_25;

public class Car extends Vehicle {

	public Car(int tire) {
		super(tire);
		// TODO Auto-generated constructor stub
	}
	
	public static void main() {
		Car mycar = new Car(1234);
		System.out.println(mycar.tire);
	}
	
}
