package com.bptn.course._08_polymorphism;
//can create a default class outside of the public class
//parent class
class Animal{
	void makeSound() {
		System.out.println("Animal makes a sound");
	}
}

//Sub class
class Dog extends Animal{
	
	@Override
	void makeSound() {
		System.out.println("Dog barks");
	}
}
public class Polymorphism1 {

	public static void main(String[] args) {
		// create an object of Animal class
		Animal a1 = new Animal();
		a1.makeSound();
		
		//create an object from Dog class
		Dog d1 = new Dog();
		d1.makeSound();
		
		
	}

}

//Major takeaways
//Method overriding - run-time polymorphism
// 1. Scenario - when the subclass decides to override an existing method in the parent class
// 2. name, return type and number of parameters
// 3. by convention, the ovverridden method will have @Override annotation above its method signature
// 4. a static method cannot be overriden