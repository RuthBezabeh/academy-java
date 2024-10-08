package com.bptn.course._codio_exercises._self_led._week_3;

//Import the ArrayList class from the java.util package
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample {
 public static void main(String[] args) {
     // Create an ArrayList of integers to store numbers
     ArrayList<Integer> arrayList = new ArrayList<Integer>();
     
     // can also initialize values at declaration using Arrays.asList()
     //ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(1,2,3,4));

     // Add elements to the ArrayList
     arrayList.add(10);
     arrayList.add(20);
     arrayList.add(30);
     arrayList.add(40);
     
     System.out.println("ArrayList Elements:");
     // Access and print elements in the ArrayList using for-each loop
     for(Integer item: arrayList){
         System.out.println(item);
     }
    

     // Update an element at index 2 (third element) to 35
     arrayList.set(2,35);
   
     // Remove an element at index 1 (second element, which is 20)
     arrayList.remove(1);

     // Print the size of the ArrayList
     System.out.println("Size of ArrayList: " + arrayList.size() );
 }
}