package com.bptn.course._codio_exercises._knowledge_check._week_3;

import java.util.ArrayList;

public class ArrayIndex {
	    public static void main(String[] args) {
	        ArrayList<String> names = new ArrayList<String>();
	        String[] friends = {"Sam", "Jessica", "Mark", "Alexis"};
	        //i should only iterate up to length of friends - 1 since 
	        //array indexes start from 0 and end at length-1
	        for (int i = 0; i <= friends.length - 1; i++) {
	            names.add(friends[i]);
	        }
	        System.out.println(names);
	    }
}
