package com.bptn.course._codio_exercises._knowledge_check._week_3;

import java.util.ArrayList;

public class RemoveLongStrings {
	public static void removeLongStrings(ArrayList<String> list) {
        //code here
        ArrayList<String> toRemove = new ArrayList<>(); //new array to temporarily hold elemets to be removed
        for(String string: list){
            if(string.length() > 4){
                toRemove.add(string); //add elements with length > 4
            }
        }
        list.removeAll(toRemove); // use removeAll to remove all elements in the toRemove collection
    }

    public static void main(String[] args) {
        //instantiate ArrayList and fill with Strings
        ArrayList<String> values = new ArrayList<String>();
        String[] words = {"bathtub", "fish", "computer", "cat", "foo"};
        for (int i = 0; i < words.length; i ++) {
            values.add(words[i]);
        }
        removeLongStrings(values);
        System.out.println("Expected Result:\t [fish, cat, foo]");
        System.out.println("Your Result:\t\t " + values);
    }
}
