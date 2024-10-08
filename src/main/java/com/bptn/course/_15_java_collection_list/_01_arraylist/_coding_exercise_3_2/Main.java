package com.bptn.course._15_java_collection_list._01_arraylist._coding_exercise_3_2;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Student1", 80));
        studentList.add(new Student("Student2", 75));
        studentList.add(new Student("Student3", 86));
        studentList.add(new Student("Student4", 74));
        studentList.add(new Student("Student5", 92));
        studentList.add(new Student("Student6", 72));
        studentList.add(new Student("Student7", 60));

        // initialize passList
        List<Student> passList = new ArrayList<>(); //using the interface list to declare the object for dependency inversion and better flexibility down the road

        // Loop through studentlist to filter the students with target grade
        for(Student student: studentList) {
        	if(student.getClassGrade() >= 75) {
        		passList.add(student);
        	}
        }
        // print out the students using a for-each loop.   
        for(Student student: studentList) { //can also use traditional loop to print the ArrayList
        	System.out.println(student)
        }
        
        //System.out.println(passList);
    }
}
