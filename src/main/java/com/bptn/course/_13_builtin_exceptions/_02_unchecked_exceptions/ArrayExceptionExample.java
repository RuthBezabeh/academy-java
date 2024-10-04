package com.bptn.course._13_builtin_exceptions._02_unchecked_exceptions;

public class ArrayExceptionExample {

	public static void main(String[] args) {
		
		int[] myArray = {10,20,30,40,50};
		
		try {
		//critical statement - access an index that is not found
		System.out.println(myArray[10]); //we know it's unchecked because it allows us to execute this line
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("An error has occured: " + e.getMessage());
		}
		}

}
