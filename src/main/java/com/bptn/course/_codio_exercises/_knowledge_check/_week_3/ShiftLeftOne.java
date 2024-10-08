package com.bptn.course._codio_exercises._knowledge_check._week_3;

import java.util.ArrayList;

public class ShiftLeftOne {
    public static void shiftLeftOne(ArrayList<Integer> list) {
        //code here
        list.add(list.get(0)); //add first element to the end of the ArrayList
        list.remove(0); //remove the first element, which is also the last, so that all elemnts shift to the left
    }

    public static void main(String[] args) {
        //instantiate ArrayList and fill with Integers
        ArrayList<Integer> values = new ArrayList<Integer>();
        int[] nums = {1, 2, 3, 4, 5};
        for (int i = 0; i < nums.length; i ++) {
            values.add(nums[i]);
        }
        shiftLeftOne(values);
        System.out.println("Expected Result:\t [2, 3, 4, 5, 1]");
        System.out.println("Your Result:\t\t " + values);
    }
}
