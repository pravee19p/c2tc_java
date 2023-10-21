package com.tns.jdbcprograms;
import java.sql.*;
import javax.sql.*;

public class Jdbcinsert {
	public static void main(String[]args) {
		try {
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/c21", "root", "prg@123");
		
		//create the statement
		Statement stmt=conn.createStatement();
		//execute a sql insert statement via executeupdate()
//		String sqlInsert="insert into books values(132,'c',499,2)";
//		System.out.println("the sql statement is "+sqlInsert);
//		int countInserted=stmt.executeUpdate(sqlInsert);
//		System.out.println(countInserted +" records inserted");
//		//delete the record
//		String sqldelete="delete from books where bookid=128";
//		System.out.println("the sql statement is "+sqldelete);
//		int countdeleted=stmt.executeUpdate(sqldelete);
//		System.out.println(countdeleted +" records deleted");
//		//display records
//		String strselect="select * from books";
//		System.out.println("the sql statement is "+strselect);
//		ResultSet rst=stmt.executeQuery(strselect);
//		System.out.println(" records are: ");
//		int rowcount=0;
//		while(rst.next()) {
//		
//			System.out.println(rst.getInt("bookid"));
//			System.out.println(rst.getString("booktitle"));
//			System.out.println(rst.getInt("price"));
//			System.out.println(rst.getInt("qty"));
//			++rowcount;
//		}
		String sqlupdate="update  books set booktitle='php'  where bookid=130";
		System.out.println("the sql statement is "+sqlupdate);
		int countupdate=stmt.executeUpdate(sqlupdate);
		System.out.println(countupdate +" records updated");
		
		}
		catch(SQLException e)
		{
			e.printStackTrace();		}
	}

}
