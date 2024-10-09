package com.bptn.course._codio_exercises._challenges._week_3._tuesday;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Start by looking in the University and Student classes. Implement the methods. 

        // Create a bunch of student objects 
        Student student1 = new Student(12, "testUsername1",
            "abc999",
            "John",
            "Doe",
            "Johndoe@gmail.com",
            "1234567890",
            "123 abc street",
            "M",
            new Date(2000, 01, 01),
            new Date(2024, 01, 01),
            1,
            "curriculumName1");

        Student student2 = new Student(123, "testUsername2",
            "abc999",
            "Jane",
            "Doe",
            "Janedoe@gmail.com",
            "1234567890",
            "123 abc street",
            "F",
            new Date(2000, 01, 01),
            new Date(2024, 01, 01),
            1,
            "curriculumName1");
            // (Make sure one student has the following studentId: 123)
            // (Make sure one other student has the following username: testUsername1)

        // Create instance of university called "university" and populate it with the students.
        University university = new University();
        university.addStudent(student1);
        university.addStudent(student2);

        System.out.println("\nUniversity ------ \n" + university.students);
        System.out.println("\nGetting student------\n" + university.getStudent(123));
        System.out.println("\nDeleting student------\n" + university.deleteStudent(123));
        System.out.println("\nSeaching student------\n" + university.searchStudent("testUserna"));

        System.out.println("\nUniversity ------ \n" + university.students);

    }
}
