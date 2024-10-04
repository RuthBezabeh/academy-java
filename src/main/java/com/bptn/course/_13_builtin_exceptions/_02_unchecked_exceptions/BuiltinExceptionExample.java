package com.bptn.course._13_builtin_exceptions._02_unchecked_exceptions;

public class BuiltinExceptionExample {
	
	public static void checkPositive(int number) throws IllegalArgumentException{
		if(number < 0) {
			throw new IllegalArgumentException("The number must be positive");
		}
		System.out.println("the number is positive");
	}
	
	public static void main(String[] args) {
		try {
			checkPositive(10);
			checkPositive(-10);
		}
		catch(IllegalArgumentException e) {
			System.out.println("Caught an exception: " + e.getMessage());
		}
	}
}

//IllegalArgumentException is a subclass of RuntimeException
//RuntimeExceptionia a subclass of exception
//
//throws always comes in the method signature to declare that method can throw one or more exceptions
//throw
//
//