package com.bptn.course._16_java_collection_set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashExample {

	public static void main(String[] args) {
		//create LinkedHashSet object
		Set<String> linkedHashSet = new LinkedHashSet<>();
	
		linkedHashSet.add("apple");
		linkedHashSet.add("banana");
		linkedHashSet.add("cherry");
		linkedHashSet.add("mango");
		
		linkedHashSet.add("apple");
		
		linkedHashSet.add(null);
		
		System.out.println(linkedHashSet);
	}

}

/*
 * Insersion order is maintained
 * does Not allow duplicates
 * allows 1 null value
 * is Not indexed
 * uses Hash Table and  doubly Linked List 
 */
