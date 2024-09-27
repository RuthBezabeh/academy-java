package com.bptn.course._04_arrays;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		//Declare and initialize and array with 6 values
		
		int[] myArray = {3,5,7,9,11,13};
		
		//Print the first and second element to the console
		System.out.println("First element: " + myArray[0]);
		System.out.println("Second element: " + myArray[1]);
		
		//Update the first element to 30
		myArray[0] = 30;
		System.out.println("Updated first element: " + myArray[0]);
		
		//Updating the last element of the array using length property and set it to 130
		myArray[myArray.length-1] = 130;
		System.out.println("Update last element: " + myArray[myArray.length-1]);
		
		//for-loop to print values from 1-10
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		
		//for loop to print all elements of myArray
		for(int i=0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}
		
		for(int i = myArray.length-1; i>=0 ; i--) {
			System.out.println(myArray[i]);
		}
		
		//enhanced for loop called for-each loop
		// no start or termination condition
		// will only iterate front to back (->)
		
		for(int element: myArray) {			
			System.out.println(element);
		}
		
		//how to print the elements in the array with out using for-loop
		System.out.println(Arrays.toString(myArray));
		
 	}
}
