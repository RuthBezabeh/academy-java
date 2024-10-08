package com.bptn.course._codio_exercises._knowledge_check._week_3;

import java.util.ArrayList;

public class SumNegValues {
	public static int sumNegValues(ArrayList<Integer> list) {
        //code here
        int sum = 0;
        for(Integer num: list){ //loop through the whole list
            if(num < 0){
                sum += num; //add number if it's negative
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        //instantiate ArrayList and fill with Integers
        ArrayList<Integer> values = new ArrayList<Integer>();
        int[] nums = {-2, 34, -11, 9, -6, 3};
        for (int i = 0; i < nums.length; i ++) {
            values.add(nums[i]);
        }
        System.out.println("Expected Result:\t -19");
        System.out.print("Your Result:\t\t ");
        System.out.println(sumNegValues(values));
    }
}
