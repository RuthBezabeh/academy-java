package com.bptn.course._17_java_collection_map;

//Import the HashMap class
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

 public static void main(String[] args) {
     Map<String, Integer> people = new HashMap<>();
     
     people.put("Angie", 33);
     people.put("Steve", 30);
     people.put("John", 32);

     for(String key: people.keySet()){
         System.out.println("Name: " + key + ", Age: " + people.get(key));
     }

 }
}
