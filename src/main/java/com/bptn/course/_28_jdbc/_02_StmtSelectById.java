package com.bptn.course._28_jdbc;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.bptn.course.Credentials;
import com.bptn.course._28_jdbc.bean.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class _02_StmtSelectById {

	public static void main(String[] args) {
				
		//make the database url
		String dbURL = "jdbc:postgresql://localhost:5433/bptn";
		String dbUsername = Credentials.dbMyUsername;
		String dbPassword = Credentials.dbMyPassword;
		
		//create sql statement
		String sql = "SELECT * FROM students WHERE \"studentId\" = ";
		
		String input = null;
		
		try(Scanner scanner = new Scanner(System.in)){
			System.out.println("Enter student id: ");
			input = scanner.nextLine();
		}
		
		sql = sql + input;
		
		//create connection with database
		//try with resources, will close the resource at the end
		try(Connection con = DriverManager.getConnection(dbURL,dbUsername, dbPassword);
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(sql);){
			
			System.out.println("connection successful");
			
			if(rs.next()) {
				int studentId = rs.getInt("studentId");
				int courseId = rs.getInt("courseId");
				String studentName = rs.getString("studentName");
				String studentEmail = rs.getString("studentName");
				String studentPhone = rs.getString("studentName");
				
				Student student = new Student();
				student.setStudentId(studentId);
				student.setCourseId(courseId);
				student.setStudentName(studentName);
				student.setStudentEmail(studentEmail);
				student.setStudentPhone(studentPhone);
				
				System.out.println(student);
				
			} else {
				System.out.println("student not found");
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

}
