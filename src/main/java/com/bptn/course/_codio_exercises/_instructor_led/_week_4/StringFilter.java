package com.bptn.course._codio_exercises._instructor_led._week_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringFilter {
	public static void main(String[] args) {
		// Declare and initialize a list of strings
		List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "date", "elderberry"));

		// Declare and initialize a character to filter out
		char c = 'e';

		// Print the list before filtering
		System.out.println("List before filtering: " + list);

		// Use the removeIf method of the list to remove elements that contain the given
		// character
		// The removeIf method takes a lambda expression as a parameter, which specifies
		// the condition for removing the element
		list.removeIf(element -> (element.indexOf(c) != -1));

		// Print the list after filtering
		System.out.println("List after filtering: " + list);
	}
}
