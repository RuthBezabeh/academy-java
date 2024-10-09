package com.bptn.course._codio_exercises._challenges._week_3._tuesday;

import java.util.*;
import java.util.stream.Collectors;

class University {

    // property - get inspired by the UML diagram
    public ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        // add a student to the "university" arraylist
        this.students.add(s);
    }

    public Student getStudent(long studentId) {
      // get the first student in the university that has the studentId. (ideally, this would be unique, so you can stop searching after finding the fist match)
      Student s = null;
        for(int i = 0; i < this.students.size(); i++){
            s = this.students.get(i);
            if(s.getStudentId() == studentId){
                return s;
            }
        }
        return null;
    }

    public List<Student> searchStudent(String userNamePrefix) {
       // return all students that have usernames beginning with the prefix 
       String partName = "";
       List<Student> similarNames = new ArrayList<>();
       for(Student s: this.students){
          partName = s.getUserName().substring(0,userNamePrefix.length());
          if(partName.equals(userNamePrefix)){
            similarNames.add(s);
          }
       }
       return similarNames;
    }

    public boolean deleteStudent(long studentId) {
       // return if a successful deletion happened
       Student s = null;
        for(int i = 0; i < this.students.size(); i++){
            s = this.students.get(i);
            if(s.getStudentId() == studentId){
                return this.students.remove(s);
            }
        }
        return false;
    }

}

