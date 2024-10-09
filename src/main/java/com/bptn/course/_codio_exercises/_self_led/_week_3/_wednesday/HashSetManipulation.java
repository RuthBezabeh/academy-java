package com.bptn.course._codio_exercises._self_led._week_3._wednesday;

import java.util.HashSet;
import java.util.Set;

public class HashSetManipulation {
	public static void main(String[] args) {
		// Create a HashSet and populate it with initial values
		Set<String> set = new HashSet<>();
		set.add("A");
		set.add("B");
		set.add("C");

		// Print the size of the set
		System.out.println("Set size: " + set.size());

		// Use for loop to print the values in the set
		for(String s: set){
			System.out.println("Value: " + s);
		}
		
		// Use add() method to add a new value to the set
		set.add("D");		
		System.out.println("Set after using add(): ");
		for(String s: set){
			System.out.println("Value: " + s);
		}

		// Use remove() method to remove a value from the set
		set.remove("A");		
		System.out.println("Set after using remove(): ");
		for(String s: set){
			System.out.println("Value: " + s);
		}

		// Use contains() method to check if the value "C" exists in the set
		if(set.contains("C")){
			System.out.println("Value 'C' exists in the set.");
		}
		else System.out.println("Value 'C' does not exist in the set.");
	}
}