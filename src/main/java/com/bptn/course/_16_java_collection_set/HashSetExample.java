package com.bptn.course._16_java_collection_set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		//create a HashSet object
		Set<String> myHashSet = new HashSet<>(); //initial capacity is 16, load factor is 0.75
		//can also use new HashSet(collection), new HashSet(int initialcapacity), new HashSet(int initialcapacity, load factor) to make a customised hashset
		
		myHashSet.add("apple");
		myHashSet.add("banana");
		myHashSet.add("cherry");
		myHashSet.add("mango");

		myHashSet.add("apple"); //does not allow duplicate
		myHashSet.add(null); //allows one null value
	
		System.out.println("the hashset of fruits" + myHashSet);
	}

}
/*
 * Insertion Order - Not preserved
 * Null values - only 1 null value
 * Duplicates - Not allowed, does not throw exception or error
 * underlying implementation - elemets stored in a hashtable
 * Indexing - hashset is Not indexed
 * 
 */