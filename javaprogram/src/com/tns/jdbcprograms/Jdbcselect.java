package com.tns.jdbcprograms;
import java.sql.*;
import javax.sql.*;//step 1 import the package

public class Jdbcselect {
	public static void main(String[]args) {
		//step 2 load and register drivers not mandotory for latest version
		//step 3 establish the connection
		try {
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/c21", "root", "prg@123");
		//step 4
		Statement st=conn.createStatement();
		//execute the query
		String strselect="select booktitle,price,qty from books";
		System.out.println("the sql statement is "+strselect);
		
		//process the result
		
		ResultSet rst=st.executeQuery(strselect);
		System.out.println("the records are");
		
		int rowcount=0;
		while(rst.next()) {
			String booktitle=rst.getString("booktitle");
			int price=rst.getInt("price");
			int qty=rst.getInt("qty");
			System.out.println(booktitle+" "+price+" "+qty);
			++rowcount;
			
			
		}
		
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
