package com.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButils {

	private static Connection con;
	
	public static void openConnection() throws SQLException {
		con=DriverManager.getConnection("jdbc:mysql://localhost:3307/facebook","root","root123");
		System.out.println("connected to DB");
	}

	public static Connection getCon() {
		return con;
	}
	
	public static void closeConnetion() throws SQLException {
		if(con!=null) {
			con.close();
		}
	}
	
}
