package com.bptn.course._15_java_collection_list._01_arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		//1st way of declaring ArrayList
		//ArrayList<Integer> arrayList = new ArrayList<>(); //type can be mentioned on both sides or just on the left as can be seen here
	
		
		//2nd way of declaring arrayList
		List<Integer> arrayList = new ArrayList<>();
		 
	    // can also initialize values at declaration using Arrays.asList()
	    //ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
		//can also set initial size of the arrayList using new ArrayList(100)
		
		//add values into arrayList
		arrayList.add(100);
		arrayList.add(200);
		arrayList.add(300);
		arrayList.add(300);//ArrayList allows duplicates
		arrayList.add(400);
		arrayList.add(null);//ArrayList allows null values
		arrayList.add(null);//ArrayList allows duplicate null values
		System.out.println(arrayList);
		
		//The size of the arrayList
		System.out.println("The size of arrayList is: "+arrayList.size());
		
		//Access the first element
		System.out.println("The first element is: " + arrayList.get(0));

		//Update the first element
		arrayList.set(2, 250);
		System.out.println("Updated ArrayList "+arrayList);
		
		arrayList.set(5, 450);
		System.out.println("Updated ArrayList "+arrayList);
		
		//set cannot access an index that does not exist
		//arrayList.set(7, 450);
		//System.out.println("Updated ArrayList "+arrayList);
		
		//add can access an index that does not exist if it's the next index
		arrayList.add(7, 500); //same as add(500)
		// but arrayList.add(10,500) would not work
		System.out.println("Updated ArrayList "+arrayList);
				
		//The size of the arrayList
		System.out.println("The size of arrayList is: "+arrayList.size());
		//remove an element from index 4
		System.out.println("The element removed is: "+ arrayList.remove(4));
		//The size of the arrayList
		System.out.println("The size of arrayList is: "+arrayList.size());
		
		//removeIf(predicate) will remove any values that satisfy the given predicate
		//removeAll(collection) - will remove any values found in the given collection
		
		//Accessing the elements using a traditional for loop
		for(int i = 0; i<arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		
		//Access the elements using a for-each loop
		for(Integer element: arrayList) {
			System.out.println(element);
		}
		
		//removing using a for loop is not recommended - could cause concurrent modification exception or error
		//should instead use iterators
	}

}
//<> dimond operators -> java generics