package com.bptn.course._25_lambdas._02_lambda_examples;

import java.util.ArrayList;
import java.util.List;

public class PrintArrayList {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(List.of("John", "Jane", "Mary"));

//		for (String str: list) {
//			System.out.println(str);
//		}

		// this will achieve the same result as above
		list.forEach(str -> System.out.println(str)); // foreach takes a comparator parameter which is a functionale
														// interface

	}
}
