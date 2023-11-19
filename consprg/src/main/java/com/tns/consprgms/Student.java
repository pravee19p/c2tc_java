package com.tns.consprgms;

public class Student {
	private int id;
	private String studentName;
	
	public void setId(int id)
	{
		this.id=id;
		System.out.println("id is "+id);
		
	}
	public void setStudentName(String studentName) {
		this.studentName=studentName;
		System.out.println("name is "+studentName);
		
	}
	void display() {
		System.out.println(id+" "+studentName);
	}

}
