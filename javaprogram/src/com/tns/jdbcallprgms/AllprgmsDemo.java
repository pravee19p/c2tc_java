package com.tns.jdbcallprgms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AllprgmsDemo {
	public static void main(String[]args) {
		

	try {
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/c21", "root", "prg@123");
		Statement stmt=conn.createStatement();
	}catch(SQLException e)
	{
	e.printStackTrace();
	}
}
}
