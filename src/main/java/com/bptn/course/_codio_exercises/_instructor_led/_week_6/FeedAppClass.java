package com.bptn.course._codio_exercises._instructor_led._week_6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bptn.course.Credentials;

public class FeedAppClass {
	private static final String userName = Credentials.dbMyUsername;
	private static final String password = Credentials.dbMyPassword;
	private static final String dbName = "feedApp";
	private static final String port = "5433";
	private static final String dbUrl = "localhost";

	public Connection createConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:postgresql://" + dbUrl + ":" + port + "/" + dbName, userName,
					password);

			

		} catch (Exception e) {
			System.out.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);

		}
		
		System.out.println("Opened database successfully");
		return conn;
	}

	public void addUser(Connection conn,  String firstName, String lastName, String username, String phone,String emailId, String password, boolean emailVerified){
		try {
			PreparedStatement stmt = null;
			String sql = "INSERT INTO \"User\" (\"firstName\", \"lastName\",  \"username\", \"phone\", \"emailId\", \"password\", \"emailVerified\", \"createdOn\") VALUES (?, ?, ?, ?, ?, ?, ?, CURRENT_TIMESTAMP)";
			
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, firstName); 
			stmt.setString(2, lastName); 
			stmt.setString(3, username); 
			stmt.setString(4, phone);
			stmt.setString(5, emailId);
			stmt.setString(6, password);
			stmt.setBoolean(7, emailVerified);

			int resultCount = stmt.executeUpdate();
			System.out.println(resultCount + " record(s) inserted");

			stmt.close();
		}catch (SQLException ex) {
            // handle exception
            System.out.println("Exception:" + ex.getMessage());
		}
	}
		
		public boolean closeConnection(Connection conn) {
			boolean flag = true;
			try {
				conn.close();
			}catch (SQLException ex) {
		        flag = false;
		        // handle exception
		        System.out.println("Exception:" + ex.getMessage());
			}
			return flag;

		}
	

}
