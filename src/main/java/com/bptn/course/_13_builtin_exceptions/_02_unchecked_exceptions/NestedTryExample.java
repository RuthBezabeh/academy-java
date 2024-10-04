package com.bptn.course._13_builtin_exceptions._02_unchecked_exceptions;

public class NestedTryExample {

	public static void main(String[] args) {
		// outer try-catch block
		try {
			int[] nums = {1,2,3,4};
			int divisor = 0;
			String text = null;
			
			//inner try-catch block
			try {
				int result = 10/divisor; //critical statement
				System.out.println("The result is: " + result);
			}
			catch(ArithmeticException e) {
				System.out.println("An error occured: " + e.getMessage());
			}
			
			//inner try-catch block 2
			try {
				System.out.println("The length of the string is: " + text.length());
				
			}
			catch(NullPointerException e) {
				System.out.println("A null pointer exception occured: " 
						
						+ e.getMessage());
			}
			
			//inner try-catch block 3
			try {
				System.out.println(nums[4]);
				
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("An ArrayIndexOutOfBounds Exception occured: " + e.getMessage());
			}
			
		}
		catch(Exception e) {
			System.out.println("A general exception occurs" + e.getMessage());
		}
	}

}
