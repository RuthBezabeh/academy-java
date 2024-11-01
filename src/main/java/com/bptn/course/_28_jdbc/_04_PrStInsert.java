package com.bptn.course._28_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.bptn.course.Credentials;
import com.bptn.course._28_jdbc.bean.Student;

public class _04_PrStInsert {

	public static void main(String[] args) {

		// make the database url
		String dbURL = "jdbc:postgresql://localhost:5433/bptn";
		String dbUsername = Credentials.dbMyUsername;
		String dbPassword = Credentials.dbMyPassword;

		// create sql statement
		String sql = "SELECT * FROM students WHERE \"studentName\" = ?";

		String input = null;

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter student name: ");
			input = scanner.nextLine();
		}

		// create connection with database
		// try with resources, will close the resource at the end
		try (Connection con = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
				PreparedStatement st = con.prepareStatement(sql);) {

			System.out.println("connection successful");
			st.setString(1, input);// index starts from 1

			try (ResultSet rs = st.executeQuery();) {

				if (rs.next()) {
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
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
