package com.bptn.course._03_flow_control._04_switch_statement;

import java.util.Scanner;

public class StringOperations {
	public static void main(String[] args) {

		// create and initialize a scanner object
		Scanner scanner = new Scanner(System.in);

		// initialize the exit condition of the do whileloop
		int exit = 1;

		// repeat the calclation if user does not want to exit
		do {

			// show the user the string operations menu
			System.out.println("/…String Menu…/");
			System.out.println("Press 1 for Palindrome Check");
			System.out.println("Press 2 to reverse a String");
			System.out.println("Press 3 to Concatenate two Strings");
			System.out.println("Press 4 for String Comparison");
			System.out.println("Press 5 to Calculate the Length of String");

			// receive the operation type from the user
			int operation = scanner.nextInt();
			
			// scanning the new line left over from the previous nextInt() scan
			scanner.nextLine();
			
			switch(operation) {
				// check if operation is palindrome check		
				case(1):{

						System.out.println("Palindrome Check");
						System.out.println("Enter a string:");
						
						String string = scanner.nextLine();
						String reverseInput = "";

				        //loop through the string input from last to first index
				        for (int i = string.length() - 1; i >= 0; i--) {
				        	
				        	//concatenate and save each character at index i to reverseInput
				            reverseInput += string.charAt(i);
				        }
				        
				        //check if the string and it's reverse are equal after converting 
				        //to lower case using toLowerCase to make sure the same letter 
				        //will be counted as equal regardless of case
				        
				        if (string.toLowerCase().equals(reverseInput.toLowerCase())) {
				        	//print is palindrome if they are equal
				            System.out.println(string + " is a palindrome");
				        } else {
				        	//print is not palindrome if not equal
				            System.out.println(string + " is not palindrome");
				        }
				        break;
						}
				// check if operation is reversing a string
				case(2):{

						System.out.println("reverse a String");
						System.out.println("Enter a string: ");
						
						String string = scanner.nextLine();
						String reverseInput = "";
	
				        //loop through the string input from last to first index
				        for (int i = string.length() - 1; i >= 0; i--) {
				        	
				        	//concatenate and save each character at index i to reverseInput
				            reverseInput += string.charAt(i);
				        }

			            System.out.println("The reverse of the entered string is: "+reverseInput);
			            
			            break;
						}
				// check if operation is concatenate two strings
				case(3):{
						System.out.println("Enter First string:");
						String firstString = scanner.nextLine();
						
						System.out.println("Enter Second string:");						
						String secondString = scanner.nextLine();
						
						System.out.println(firstString+secondString);
						
						break;
						}
				// check if operation is string comparison
				case(4):{
						System.out.println("String Comparison\n");
						System.out.println("Enter First string:");
						String firstString = scanner.nextLine();
						
						System.out.println("Enter Second string:");						
						String secondString = scanner.nextLine();
						
						if(firstString.equals(secondString)) {
							System.out.println("The entered strings are equal");
						}else {
							System.out.println("The entered strings are not equal");
						}
						break;
						}
				// check if operation is calculating the length of a string
				case(5):{
	
						System.out.println("Length of a string");
						System.out.println("Enter a string: ");
						
						String string = scanner.nextLine();
						
						System.out.println("The length of the entered string is: " + string.length());
						
						break;
						}
				// check if operation is palindrome check
				default:{
						System.out.println("Invalid choice! Please make a valid choice.");
						}
			}
			
			// ask user for confirmation to continue
			System.out.println("To continue string operations Press 1, else press any other number to exit");

			// get user confirmation
			exit = scanner.nextInt();

		} while (exit == 1);

	}
}

