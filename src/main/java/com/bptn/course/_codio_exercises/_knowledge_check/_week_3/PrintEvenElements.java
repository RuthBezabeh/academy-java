package com.bptn.course._codio_exercises._knowledge_check._week_3;

import java.util.ArrayList;

public class PrintEvenElements {
    public static void printEvenElements(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) { //size() is the method used to get the size of an ArrayList
            if (list.get(i) % 2 == 0) {
                System.out.print(list.get(i) + ", ");
            }
        }
    }

    public static void main(String[] args) {
        //instantiate ArrayList and fill with Integers
        ArrayList<Integer> values = new ArrayList<Integer>();
        int[] nums = {1, 44, 7, 9, -16, 3, 2};
        for (int i = 0; i < nums.length; i ++) {
            values.add(nums[i]);
        }
        System.out.println("Expected Result:\t 44, -16, 2,");
        System.out.print("Your Result:\t\t ");
        printEvenElements(values);
    }
}
