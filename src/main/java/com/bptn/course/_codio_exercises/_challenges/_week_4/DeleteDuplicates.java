package com.bptn.course._codio_exercises._challenges._week_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class DeleteDuplicates {

	/*
	 * This method deletes duplicates from an unsorted ArrayList.
	 * 
	 * @param nums the sorted ArrayList with duplicates
	 * 
	 * @return a sorted ArrayList without duplicates
	 */
	public static List<Integer> deleteDuplicates(List<Integer> nums) {

		// Check if the list is null or empty, and return an empty list if so
		if (nums == null || nums.size() == 0) {
			// ...
			return new ArrayList<Integer>();
		}

		// Implement the bigger details of your algorithm here...
		List<Integer> nums2 = new ArrayList<>();
		for (int i = 0; i < nums.size(); i++) {
			int number = nums.get(i);
			if (!nums2.contains(number)) {
				nums2.add(number);
			}
		}
		// return sortedAndUnique arraylist
		return quickSort(nums2);
	}

	public static List<Integer> quickSort(List<Integer> nums) {
		int pivot = nums.get(nums.size() - 1);
		int i = 0;
		int temp = 0;
		for (int j = 0; j < nums.size(); j++) {
			if (nums.get(j) < pivot) {

				temp = nums.get(j);
				nums.set(j, nums.get(i));
				nums.set(i, temp);
				i++;

			}
		}

		nums.set(nums.size() - 1, nums.get(i));
		nums.set(i, pivot);

		if (i == nums.size() - 1) {
			return nums;
		}

		return quickSort(nums);

	}

	public static void main(String[] args) {
		// Initialize a sample sorted ArrayList with duplicate values
		List<Integer> nums = new ArrayList<>();
		nums.add(1);
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(3);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		nums.add(5);

		// Call the deleteDuplicates method with the sample list as argument
		List<Integer> result = deleteDuplicates(nums);

		// Print the result to the console
		System.out.println(result);
	}
}
