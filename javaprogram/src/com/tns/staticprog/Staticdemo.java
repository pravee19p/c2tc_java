package com.tns.staticprog;

public class Staticdemo {
	public static void main(String[]args)
	{
		System.out.println(Employee.companyName);
		Employee e=new Employee("boobesh",11202);
		System.out.println(e);
		 e=new Employee("hariharan",11302);
			System.out.println(e);
	}

}
