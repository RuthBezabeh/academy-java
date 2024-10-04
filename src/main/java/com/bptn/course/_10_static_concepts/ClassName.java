package com.bptn.course._10_static_concepts;

public class ClassName {

	//declare a static variable
	static int staticVariable = 100; // assigning value not necessary
	
	//declare an instance variable
	int instanceVariable;
	
	//declare a static method
	static void staticMethod() {
		System.out.println("Static method is called");
		
		//can i access an instance variable? NO
		//instanceVariable = 100;
		
		//can i access an instance method? NO
		//instanceMethod();
	}
	
	void instanceMethod() {
		System.out.println("Static method is called");
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

//Major takeaways
//
