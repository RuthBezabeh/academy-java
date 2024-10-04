package com.bptn.course._13_builtin_exceptions._02_unchecked_exceptions;

public class NullPoinerEceptionExample {

	public static void main(String[] args) {
		String text = null;
		try {
			System.out.println("Length of the string is: " + text.length());;
		}
		catch(NullPointerException e) {
			System.out.println("An erro occured: " + e.getMessage());
		}
		
		System.out.println("statements after the try catch");
	}

}
