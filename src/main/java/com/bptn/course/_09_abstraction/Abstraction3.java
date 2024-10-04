package com.bptn.course._09_abstraction;


//Abstraction using interface (After Java 8)
//From Java 8- Interfaces can support abstract methods, default methods and static methods

interface Operations{
	
	void draw(); //abstract method- it has no implementation
	
	//default method- has some implementation
	default int add(int a, int b) {
		return a + b;
	}
	
	//static method
	static double getRandomNumber() {
		return Math.random();
	}
}

//sub class- create a sub class that implements the Operations interface
class Calculator implements Operations{

	//compiler always enforces the sub class to implement or override the methods in the abstract methods from the interface
	@Override
	public void draw() {
		
		System.out.println("Draw method implemented by Calculator class");
	}
	
}


public class Abstraction3 {

	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();
		c1.draw();
		
		int result = c1.add(2, 3);
		
		System.out.println("The result is: "+ result);
		
		System.out.println("The random number is: "+ Operations.getRandomNumber()); 

	}

}
//Major takeaways
//1. Interface cannot be instantiated
//2. Abstract methods in the interface is implemented using a subclass
//3. Interfaces support multiple inheritance - separated by a comma

//Interface cannot have instance variables
//Interface cannot have constructors
//It can consist of constants