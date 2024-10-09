package com.bptn.course._17_java_collection_map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Iterator;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		// create linked hash map object
		Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
		
		linkedHashMap.put("ruth", 26);
		linkedHashMap.put("tom", 27);
		linkedHashMap.put("ruth", 30); //duplicates not allowed, 1st one will be overwrittedn
		linkedHashMap.put("tim", 27);
		linkedHashMap.put("zen", 29);
		linkedHashMap.put(null, 10);// can have 1 null value,same as hashmap
		linkedHashMap.put(null, 100); //will overwrite the previous null
		linkedHashMap.put("zen", null);
		linkedHashMap.put("paul", null); //can have duplicate null values
	

		System.out.println(linkedHashMap);
		
		//access value
		System.out.println("ruth's age is: " + linkedHashMap.get("ruth"));
		
		//loop over the linkedhashmap using a entrySet
		for(Map.Entry<String, Integer> entry: linkedHashMap.entrySet()) {
			System.out.println("Name: " + entry.getKey() + ", Age: " + entry.getValue());
		}
		
		//using iterator
		Iterator<Map.Entry<String, Integer>> it = linkedHashMap.entrySet().iterator();
		
		while(it.hasNext()) {
			Map.Entry<String, Integer> next = it.next();
			System.out.println("Name: " + next.getKey() + ", Age: " + next.getValue());
		}
	}

}

//Major takeawasy
//does it preserve insersion order - Yes
//does keys allow null values - yea, only one like set
//does values allow null values yea, can have multiple like list
//does keys allow for duplicates - No, will update/overwrite previous value
//does values allow for duplicates - Yes

//used hash table and linked list data structure
