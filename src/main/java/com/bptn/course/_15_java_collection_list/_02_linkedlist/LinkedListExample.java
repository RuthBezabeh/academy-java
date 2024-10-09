package com.bptn.course._15_java_collection_list._02_linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListExample {

	public static void main(String[] args) {
		//1st way to initialize
		List<String> colors1 = new LinkedList<>();
		
		//2nd way
		LinkedList<String> colors = new LinkedList<>();
		
		//add colors
		colors.add("purple");
		
		//addfirst, removefirst, addlast, getlast etc can only be accessed if 
		//the linked list is initialized as LinkedList and not List if using 
		//java version earlier than 21.
		colors.addFirst("scarlet");
		colors.addLast("burgendy");
		
		System.out.println("Linked list after adding colors: " + colors);
		
		colors.removeFirst();
		colors.removeLast();
		
		System.out.println("Linked list after adding colors: " + colors);
		
		
		colors.add("pink");
		colors.add("pink"); // can store duplicates
		colors.add(1,"scarlet");
		//colors.add(null);
		System.out.println("Linked list after adding colors: " + colors);
		
		//removing using an index
		colors.remove(2); //will return the  removed object
		
		//accessing an element at an index
		System.out.println("the element at index 2 is: "+colors.get(2));
		
		//accessing elements of a linked list using a for loop
		for(int i = 0; i< colors.size();i++) {
			System.out.println(colors.get(i));
		}
		
		for(String color: colors) {
			System.out.println(color);
		}
		
		System.out.println("Accessing the element using Iterator");
		
		//can not add element using Iterator, to add we have to use
		// the sub interface ListIterator
		Iterator<String> it = colors.iterator();
		
		while(it.hasNext()) {
			System.out.println("next element is " + it.next() );
		}
		
		System.out.println(colors);
		//removing an element using an iterator
		//have to create a new iterator since the prevoius one has already traversed to the end
		
		Iterator<String> iterator = colors.iterator();
		
		while(iterator.hasNext()) {
			String color = iterator.next();
			/*
			 * if the value of color is null the condition
			 * below will throw a nullpointerexception
			 * ----
			 * should either use try catch or not add null values
			 * */
			if(color.equals("pink")) {
				iterator.remove();
				System.out.println("The color is removed sucessfully.");
			}
		}
		System.out.println(colors);
		
		ListIterator<String> listIterator = colors.listIterator();
		
		while(listIterator.hasNext()) {
			String color = listIterator.next();
			
			if(color.equals("purple")) {
				listIterator.add("violet");
				System.out.println("The color is added sucessfully.");
			}
		}
		
		System.out.println(colors);
		
		
	}

}

/* LinkedList CAN have duplicates
 * LinkedList preserves insertion order
 * LinkedList CAN have null values
 * 
 * CAN remove an element while looping through using an Iterator
 * CANNOT add an element while looping through using an Iterator
 * CAN add an element while looping through using an ListIterator
 * 
 * */
