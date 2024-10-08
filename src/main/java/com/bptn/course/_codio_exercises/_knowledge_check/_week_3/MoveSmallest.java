package com.bptn.course._codio_exercises._knowledge_check._week_3;

import java.util.ArrayList;

public class MoveSmallest {
	public static void moveSmallest(ArrayList<Integer> list) {
        int smallestIndex = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < list.get(smallestIndex)) {
                smallestIndex = i; //if element at i is less than element at smallestIndex, replace smallestIndex by I
            }
        }
        //move smallest to front
        list.add(0, list.get(smallestIndex)); //add the smallest element to the front
        list.remove(smallestIndex+1); //remove smallest element from previous position + 1 since it was shifted to the right 
    }

    public static void main(String[] args) {
        //instantiate ArrayList and fill with Integers
        ArrayList<Integer> values = new ArrayList<Integer>();
        int[] nums = {3, 11, 54, 7, 1, 22};
        for (int i = 0; i < nums.length; i ++) {
            values.add(nums[i]);
        }
        moveSmallest(values);
        System.out.println("Expected Result:\t [1, 3, 11, 54, 7, 22]");
        System.out.println("Your Result:\t\t " + values);
    }
}
