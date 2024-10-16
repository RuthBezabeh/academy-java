package com.bptn.course._21_search;

public class LinearSearch {

	static int linearSearch(int[] arr, int key) {
		
		int size = arr.length;
		for(int i=0; i < size; i++) {
			if(arr[i] == key) {
				return i;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		int[] input = {1,2,3,4,56,2,90,4,53,-7,33};
		int key = -7;
		 System.out.println(linearSearch(input, key));
	}
}
