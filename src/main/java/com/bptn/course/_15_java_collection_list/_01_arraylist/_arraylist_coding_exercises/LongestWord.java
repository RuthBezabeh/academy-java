package com.bptn.course._15_java_collection_list._01_arraylist._arraylist_coding_exercises;

import java.util.ArrayList;

public class LongestWord {
	public static String findLongest(ArrayList<String> list) {
        //code here
        String longest = ""; //so length will initialy be zero
        for(String s: list){
            if(s.length()>longest.length()) //length of string using .length() not size()
            longest = s;
        }
        return longest;
    }

    public static void main(String[] args) {
        //instantiate ArrayList and fill with Strings
        ArrayList<String> values = new ArrayList<String>();
        String[] words = {"singapore", "cattle", "metropolitan", "turnstile"};
        for (int i = 0; i < words.length; i ++) {
            values.add(words[i]);
        }
        System.out.println("Expected Result:\t metropolitan");
        System.out.print("Your Result:\t\t ");
        System.out.println(findLongest(values));
    }

}