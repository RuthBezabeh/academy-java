package com.bptn.course._20_junit;

public class Calculator {
	public int findMax(int[] array) {
		int max = Integer.MIN_VALUE;
		for (int number: array) {
			if(number > max) {
				max = number;
			}
		}
		
		return max;
	}

}
