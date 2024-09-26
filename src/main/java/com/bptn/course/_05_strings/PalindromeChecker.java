package com.bptn.course._05_strings;

import java.util.Scanner;

public class PalindromeChecker {
	public static void main(String[] args) {

    	// prompt the user for an input
        System.out.println("Enter the string to check for palindrome: ");
        
        //create a Scanner object
        Scanner scanner = new Scanner(System.in);
        
        //get user input using scanner and store in a string variable
        String input = scanner.nextLine();
        
        //initialize a string to store the reverse string
        String reverseInput = "";

        //loop through the string input from last to first index
        for (int i = input.length() - 1; i >= 0; i--) {
        	
        	//concatenate and save each character at index i to reverseInput
            reverseInput += input.charAt(i);
        }
        
        //check if the string and it's reverse are equal after converting 
        //to lower case using toLowerCase to make sure the same letter 
        //will be counted as equal regardless of case
        
        if (input.toLowerCase().equals(reverseInput.toLowerCase())) {
        	//print is palindrome if they are equal
            System.out.println("Input string is palindrome");
        } else {
        	//print is not palindrome if not equal
            System.out.println("Input string is not palindrome");
        }
        
        //close scanner
        scanner.close();
   
	}
}

/*
 * Summary
 * 
 * From this exercise i learned to use .equals() instead of ==
 * to compare strings. I also learned that strings could be 
 * mistaked as not a palindrome if they are not converted to
 * all lower case or all upper case for comparison. I will be 
 * converting strings to all lower case before comparing in the 
 * future.
 */
