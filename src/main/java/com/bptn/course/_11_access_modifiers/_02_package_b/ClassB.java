package com.bptn.course._11_access_modifiers._02_package_b;

import com.bptn.course._11_access_modifiers._01_package_a.ClassA;

public class ClassB extends ClassA {

	public static void main(String[] args) {
		//create an object of ClassA
		ClassA myObj = new ClassA();
		
		//we can  NOT access the private method within a different package
		//myObj.privateMethod();
		
		//we can NOT access a private variable within a different package
		//System.out.println("Accessing private variable: " + myObj.privateVar);
		
		//we can NOT access the default method within a different package
		//myObj.defaultMethod();
		
		//we can NOT access a default variable within a different package
		//System.out.println("Accessing default variable: " + myObj.defaultVar);
		
		//we can NOT access the protected method within a different package
		//myObj.protectedMethod();
				
		//we can NOT access a protected variable within  a different package
		//System.out.println("Accessing protected variable: " + myObj.protectedVar);
		
		//we can access the public method within  a different package
		//myObj.publicMethod();
				
		//we can access a public variable within  a different package
		System.out.println("Accessing public variable: " + myObj.publicVar);
		
		//we can access a protected method and variable though an object of a subclass of classA in a different package
		ClassB myObj1 = new ClassB();
		myObj1.protectedMethod();
		System.out.println("Accessing protected variable: " + myObj1.protectedVar);
		
		
		
		
		
	}

}


//major takeaways
//1. we can NOT access private variable and method within the same package in a different class
//2. we can NOT access default variable and method within a different class in the same package
//   default = package private
//3. we can NOT access protected variable and method within the same package in a different class
//4. we can access public variable and method within the same package in a different class 

