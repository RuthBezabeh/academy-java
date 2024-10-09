package com.bptn.course._16_java_collection_set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {//implements navigableSet which is a sub interface of set

	public static void main(String[] args) {
		// create a TreeSet object
		Set<String> myTreeSet = new TreeSet<>();
		
		
		//can use a different constructor arrange elements in a descending order
		
		//added values will be stored in a natural ascending order 
		myTreeSet.add("cherry");
		myTreeSet.add("mango");
		myTreeSet.add("banana");
		myTreeSet.add("apple");
		

		myTreeSet.add("apple"); //does not allow duplicate
		//myTreeSet.add(null); //Does Not allow one null value
	
		System.out.println("the TreeSet of fruits" + myTreeSet);
	
		

	}

}

/*
 * Insersion order is Not , Natural Ascending order is maintained
 * does Not allow duplicates
 * does Not allow null value
 * is Not indexed
 * underlying implementation is a treemap
 * 
 * good for small application with small amount of data
 */