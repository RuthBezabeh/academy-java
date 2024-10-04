package com.bptn.course._06_big_coding_challenges._week_1;

import java.util.*;

public class Calculator {
	public static void main(String[] args) {

		// create and initialize a scanner object
		Scanner scanner = new Scanner(System.in);

		// initialize the exit condition of the do whileloop
		int exit = 1;

		// repeat the calclation if user does not want to exit
		do {

			// show the user the calculator menu
			System.out.println("/…Calculator Menu…/");
			System.out.println("Press 1 for addition");
			System.out.println("Press 2 for subtraction");
			System.out.println("Press 3 for multiplication");
			System.out.println("Press 4 for division");
			System.out.println("Press 5 to square a number");
			System.out.println("Press 6 to find a square root");
			System.out.println("Press 7 to find the reciprocal");

			// receive the operation type from the user
			int operation = scanner.nextInt();

			// check if the operation is addition
			if (operation == 1) {

				System.out.println("Enter the first number: ");
				double num1 = scanner.nextDouble();

				System.out.println("Enter the second number: ");
				double num2 = scanner.nextDouble();

				System.out.println("The addition of the numbers " + num1 + " and " + num2 + " is = " + (num1 + num2));

			}
			// check if the operation is subtraction
			else if (operation == 2) {

				System.out.println("Enter the first number: ");
				double num1 = scanner.nextDouble();

				System.out.println("Enter the second number: ");
				double num2 = scanner.nextDouble();

				System.out.println("The subraction of the numbers " + num1 + " and " + num2 + " is = " + (num1 - num2));

			}
			// check if the operation is multiplication
			else if (operation == 3) {

				System.out.println("Enter the first number: ");
				double num1 = scanner.nextDouble();

				System.out.println("Enter the second number: ");
				double num2 = scanner.nextDouble();

				System.out.println("The product of the numbers " + num1 + " and " + num2 + " is = " + (num1 * num2));

			}
			// check if the operation is division
			else if (operation == 4) {
				System.out.println("Enter the first number: ");
				double num1 = scanner.nextDouble();

				System.out.println("Enter the second number: ");
				double num2 = scanner.nextDouble();

				System.out.println("Dividing " + num1 + "  by " + num2 + " the quotient is " + (num1 / num2)
						+ "\nThe remainder is " + (num1 % num2));

			}
			// check if the operation is square
			else if (operation == 5) {

				System.out.println("Enter the number to find Square: ");
				double num = scanner.nextDouble();

				System.out.println("The Square of the number " + num + " is = " + (num * num));

			}
			// check if the operation is square root
			else if (operation == 6) {

				System.out.println("Enter the number to find Square root: ");
				double num = scanner.nextDouble();

				System.out.println("The Square root of the number " + num + " is = " + Math.sqrt(num));

			}
			// check if the operation is reciprocal
			else if (operation == 7) {

				System.out.println("Enter the number to find Reciprocal :");
				double num = scanner.nextDouble();

				System.out.println("The Reciprocal of the number " + num + " is = " + (1 / num));

			}
			// inform user their choice is invalid
			else {
				System.out.println("Invalid choice! Please make a valid choice.");
			}

			// ask user for confirmation to continue
			System.out.println("To continue calculation Press 1, else press any other number to exit");

			// get user confirmation
			exit = scanner.nextInt();

		} while (exit == 1);

	}
}

/* Summary
 * 
 * In this coding exercise i was able to practice using a scanner, conditional statements, 
 * do while loop, and arithmetic operations. It was a little tedious writing if-else statements 
 * again and again and that made me see the benefit of using switch statements.
 * 
 * I also realised that the code does not handle errors well when a user inputs a string or 
 * char value so that's somthing i'll pay attention to in the future
 */