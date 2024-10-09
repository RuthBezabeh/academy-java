package com.bptn.course._17_java_collection_map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		// create a hashmap object
		Map<String, Integer> ages = new HashMap<>();
		
		ages.put("ruth", 26);
		ages.put("tom", 27);
		ages.put("ruth", 30); //duplicates not allowed, 1st one will be overwrittedn
		ages.put("tim", 27);
		ages.put("zen", 29);
		ages.put(null, 10);// can have 1 null value
		ages.put(null, 100); //will overwrite the previous null
		ages.put("zen", null);
		ages.put("paul", null);
		
		System.out.println(ages);
		
		//keySet()
		for(String key: ages.keySet()) {
			System.out.println("Name: "+ key + ", Age: "+ ages.get(key));
		}
		
		//retrieve the age of John and print it to the console
		System.out.println("Age of zen is: " + ages.get("zen"));
		
		//updating an entry using replace
		ages.replace("tim", 35);
		System.out.println("new age of tim is: " + ages.get("tim"));
		
		ages.replace("bob", 50); //since bob does not exist replace will not add it, but put will add it if it doesn't exist
		System.out.println(ages);
		
		
		//check if the key is present in the map using containsKey(object k) method
		if(ages.containsKey("ruth")) {
			System.out.println("the key exists");
		}
		else 
			System.out.println("the key does not exist");
		
		//check if the value is present in the map using containsValue(object k) method
				if(ages.containsValue(35)) {
					System.out.println("the value exists");
				}
				else 
					System.out.println("the value does not exist");
			
		//putIfAbsent(Object k, Object v) - used to add a key-value pair if it doesn't already exist
		ages.putIfAbsent("ruth", 100 ); //will not replace if key exists
		System.out.println(ages);
		
		//Iterating through the HashMap using entrySet() method
		for(Map.Entry<String, Integer> entry: ages.entrySet()) {
			//each entry will have 1 key and 1 value accessed using getKey() and getValue()
			System.out.println("Name: " + entry.getKey() + ", Age: " + entry.getValue());
		}
		
		
	}

}
//Major takeawasy
// does it preserve insersion order - No
// does keys allow null values - yea, only one like set
// does values allow null values yea, can have multiple like list
// does keys allow for duplicates - No, will update/overwrite previous value
// does values allow for duplicates - Yes

//uses hash table data stucture