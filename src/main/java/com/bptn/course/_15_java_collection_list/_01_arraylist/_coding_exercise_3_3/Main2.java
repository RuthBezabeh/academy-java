package com.bptn.course._15_java_collection_list._01_arraylist._coding_exercise_3_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main2 {

	public static void main(String[] args) {
		
		String [] cars = {"Volvo", "Honda", "Ford"};
		List<String> newList = new ArrayList<>(Arrays.asList(cars));
		
		System.out.println("The converted arrayList is: " + newList);
	}

}
