package com.bptn.course._codio_exercises._capstone_day;

import java.sql.Connection;

public class Main {

	public static void main(String[] args) {
		WeatherAppUserInsertion jdbc = new WeatherAppUserInsertion();
		Connection conn = jdbc.createConnection();
		
		jdbc.addUser(conn, "Ray", "Mist", "raymist", "18292831", "ray@mist.com", "Ray@22", true);
		jdbc.closeConnection(conn);

	}

}