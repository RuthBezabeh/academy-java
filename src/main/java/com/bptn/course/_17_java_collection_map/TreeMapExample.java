package com.bptn.course._17_java_collection_map;

import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap<String, Integer> treemap = new TreeMap<>();
		
		
		treemap.put("ruth", 26);
		treemap.put("tom", 27);
		treemap.put("ruth", 30); //duplicates not allowed, 1st one will be overwrittedn
		treemap.put("tim", 27);
		treemap.put("zen", 29);
		//treemap.put(null, 10);// can not have 1 null value,same as hashmap
		treemap.put("zen", null);
		treemap.put("paul", null); //can have duplicate null values
	
		System.out.println(treemap);
		
		//firstKey to access the first key
		
		System.out.println("first key is: " + treemap.firstKey());
		//firstEnrty implemented from navigable map not map
		System.out.println("first entry is: " + treemap.firstEntry());

	}

}
//Major takeawasy
//does it preserve insersion order - no, maintains natural order
//does keys allow null values - no
//does values allow null values yea, can have multiple like list
//does keys allow for duplicates - No, will update/overwrite previous value
//does values allow for duplicates - Yes

//uses the tree data structure