package com.bptn.course._codio_exercises._knowledge_check._week_3;

import java.util.ArrayList;

public class PrintEvenIndexes {
    public static void printEvenIndex(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) { //i should go from 0 to size()-1 to iterate through the whole list
            if (i % 2 == 0) { //remainder should be 0 for even number
                System.out.print(list.get(i) + ", ");
            }
        }
    }

    public static void main(String[] args) {
        //instantiate ArrayList and fill with Integers
        ArrayList<Integer> values = new ArrayList<Integer>();
        int[] nums = {1, 5, 7, 9, -2, 3, 2};
        for (int i = 0; i < nums.length; i ++) {
            values.add(nums[i]);
        }
        System.out.println("Expected Result:\t 1, 7, -2, 2,");
        System.out.print("Your Result:\t\t ");
        printEvenIndex(values);
    }
}
