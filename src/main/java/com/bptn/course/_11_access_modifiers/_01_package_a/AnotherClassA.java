package com.bptn.course._11_access_modifiers._01_package_a;

public class AnotherClassA {

	public static void main(String[] args) {
		//create an object of ClassA
		ClassA myObj = new ClassA();
		
		//we can  NOT access the private method within the same class
		//myObj.privateMethod();
		
		//we can NOT access a private variable within the same class
		//System.out.println("Accessing private variable: " + myObj.privateVar);
		
		//we can access the default method within the same package in a different class
		myObj.defaultMethod();
		
		//we can access a default variable within the same package in a different class
		System.out.println("Accessing default variable: " + myObj.defaultVar);
		
		//we can access the protected method within the the same package in a different class
		myObj.protectedMethod();
				
		//we can access a protected variable within the the same package in a different class
		System.out.println("Accessing protected variable: " + myObj.protectedVar);
		
		//we can access the public method within the the same package in a different class
		myObj.publicMethod();
				
		//we can access a public variable within the the same package in a different class
		System.out.println("Accessing public variable: " + myObj.publicVar);
				
			
	}

}


//major takeaways
//1. we can NOT access private variable and method within the same package in a different class
//2. we can access default variable and method within a different class in the same package
//3. we can access protected variable and method within the same package in a different class
//4. we can access public variable and method within the same package in a different class 
