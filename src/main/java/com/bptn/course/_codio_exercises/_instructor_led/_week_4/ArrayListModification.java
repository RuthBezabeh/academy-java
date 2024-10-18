package com.bptn.course._codio_exercises._instructor_led._week_4;

import java.util.ArrayList;

public class ArrayListModification {
	public static void main(String[] args) {
		// Create an ArrayList
		ArrayList<String> languages = new ArrayList<>();

		// Add elements to the ArrayList
		languages.add("java");
		languages.add("javascript");
		languages.add("swift");
		languages.add("python");

		System.out.println("Original ArrayList:");
		// Print the original ArrayList using forEach and a lambda
		languages.forEach(element -> System.out.println(element));

		// Modify all elements to uppercase using replaceAll()
		languages.replaceAll(element -> element.toUpperCase());

		System.out.println("\nUpdated ArrayList:");

		// Print the updated ArrayList using forEach and a lambda
		languages.forEach(element -> System.out.println(element));

	}
}
