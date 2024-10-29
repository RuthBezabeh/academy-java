package com.bptn.course._27_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class _02_EvenNumberExample {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,2,3,4,4,5,5,6,7,8,9,10,8);
		
		//using oop
		List<Integer> evens = new ArrayList<>();
		
		for(int n: nums) {
			if(n%2==0) {
				evens.add(n);
			}
		}		
		System.out.println("OOP: " + evens);
	
		evens = nums.stream().filter(n -> n%2==0).toList();
		System.out.println("FP: " + evens);
		
		//convert to set
		Set<Integer> evenSet = new HashSet<>();		
		evenSet = evens.stream().collect(Collectors.toSet());
		
		
	}

}
