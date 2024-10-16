package com.bptn.course._22_sorting;


import java.util.Arrays;

public class InsertionSort {



	public static void insertionSort(int[] elements) {


		for (int i = 1; i < elements.length; i++) {

			int temp = elements[i];
			int possibleIndex = i;

			while (possibleIndex > 0 && temp < elements[possibleIndex - 1]) {


				elements[possibleIndex] = elements[possibleIndex - 1];
				possibleIndex--; // 

			}


			elements[possibleIndex] = temp;

		}

	}

	public static void main(String[] args) {

		int[] arr1 = {3,15,8,2,19,55};

		System.out.println("Before: " + Arrays.toString(arr1));

		insertionSort(arr1);
		System.out.println("After: " + Arrays.toString(arr1)); // [2,3,8,15,19,55]

	}
}
