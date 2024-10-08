package com.bptn.course._15_java_collection_list._01_arraylist._arraylist_coding_exercises;

import java.util.ArrayList;
public class ToDoList {

	   public static void main(String[] args) {
	      // Rewrite this code to use an ArrayList instead of an array
//	      String[] toDoList = new String[3];
		   
		   ArrayList<String> newList = new ArrayList<>();
//	      toDoList[0] = "Do homework";
//	      toDoList[1] = "Help make dinner";
//	      toDoList[2] = "Call grandma";
		   
		   newList.add("Do homework");
		   newList.add("Help make dinner");
		   newList.add("call grandma");
//
//	      // changing element at index 1
//	      toDoList[1] = "Order pizza";
		   
		   newList.set(1, "Order pizza");
//
//	      System.out.println(toDoList.length + " things to do!");
//	      System.out.println("Here's the first thing to do: "
//	           + toDoList[0] );
		   
		   System.out.println(newList.size() + " things to do!");
		   System.out.println("Here's the first thing to do: " + newList.get(0));
//
//	      // remove item 0 and move everything down
//	      //  (this can be done in 1 command with ArrayList)
//	      toDoList[0] = toDoList[1];
//	      toDoList[1] = toDoList[2];
//	      toDoList[2] = "";
//
//	      System.out.println("Here's the next thing to do: "
//	           + toDoList[0] );

		   newList.remove(0);
		   System.out.println("Here's the next thing to do: " + newList.get(0));

		   
	   }
}
