package com.bptn.course._16_java_collection_set;

import java.util.TreeSet;

public class TreeSetManipulation {
    public static void main(String[] args) {

        // Create a TreeSet and populate it with the elements A, B and C.
       TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("A");
        treeSet.add("B");
        treeSet.add("C");

        // Print the size of the set
        System.out.println("Set size: " + treeSet.size());

        // Print the elements in the set
        System.out.println("Elements in set: " + treeSet);


        // Use the first() method to get the first element in the set, then print it out.
        System.out.println("First element: " + treeSet.first());


        // Use the last() method to get the last element in the set, then print it out.
        System.out.println("Last element: " + treeSet.last());


        // Use the headSet() method to get the elements in the set that are strictly less than the element B.  
        System.out.println("Elements less than 'B': " + treeSet.headSet("B"));

        
        // Use the tailSet() method to get the elements in the set that are greater than or equal to B.
         System.out.println("Elements greater than or equal to 'B': " + treeSet.tailSet("B"));


        // Use subSet() method to get the elements in the set that are greater than or equal to a lower bound and less than an upper bound. In this case, the elements between A (inclusive) and C (exclusive).
         System.out.println("Elements between 'A'(inclusive) and 'C'(exclusive): " + treeSet.subSet("A", "C"));


        // Use contains() method to check if B exists in the set.
        System.out.println("Does the set contain 'B'? " + treeSet.contains("B"));

        
        // Use remove() method to remove B from the set.
        treeSet.remove("B");

        // Print the set to show that the element B has been removed.
        System.out.println("Set after removing 'B': " + treeSet);

    }
}

