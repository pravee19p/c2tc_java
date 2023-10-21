package com.tns.jdbcallprgms;

import java.sql.Statement;

public class Allprgms {

	void insert()
	{
		//Statement stmt=conn.createStatement();
		//execute a sql insert statement via executeupdate()
		String sqlInsert="insert into books values(132,'c',499,2)";
		System.out.println("the sql statement is "+sqlInsert);
		int countInserted=stmt.executeUpdate(sqlInsert);
	}
	void delete()
	{
		
		String sqldelete="delete from books where bookid=128";
		System.out.println("the sql statement is "+sqldelete);
		int countdeleted=stmt.executeUpdate(sqldelete);
	}
}
