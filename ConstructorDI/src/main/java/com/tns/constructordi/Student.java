package com.tns.constructordi;

public class Student {
	
	private int id;
	private String studentname;
	public Student(int id, String studentname) {
		super();
		this.id = id;
		this.studentname = studentname;
		System.out.println("internally calls the construtor");
	}
	void display()
	{
		System.out.println(id+ "  "+studentname);
	}
	

}
