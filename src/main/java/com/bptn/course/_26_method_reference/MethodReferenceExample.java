package com.bptn.course._26_method_reference;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface Sayable{
	void say();
}

class MyClass{
	static void saySomething() {
		System.out.println("I say something");
	}
	void saySomething2() {
		System.out.println("I say something");
	}
}
public class MethodReferenceExample {

	public static void main(String[] args) {
		
		Sayable obj1 = () -> System.out.println("Say something using lambda");
		obj1.say();
		
		//if the implemented method is static
		Sayable obj2 = MyClass::saySomething;
		obj2.say();
		
		//if the method is non static
		//1 using a regular object
		MyClass myObject = new MyClass();
		Sayable obj3 = myObject::saySomething2;
		obj3.say();
		
		//2 using an anonymous object
		Sayable obj4 = new MyClass()::saySomething2;
		obj4.say();
		
		//
		List<String> strs = new ArrayList<>(List.of("Hello", "Java"));
		
		strs.forEach(str -> System.out.println(str));
		//another way, but not always possible to convert lambda expressions to method references
		strs.forEach(System.out::print);
	}

}
