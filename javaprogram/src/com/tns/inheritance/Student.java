package com.tns.inheritance;

public class Student extends Citizen {
	private String collegeName;
	private int rollNo;
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public Student(String name,long aadharNo,String address,long phoneNo, String collegeName, int rollNo ) {
		super(name,aadharNo,address,phoneNo);
		
		this.collegeName =collegeName ;
		this.rollNo = rollNo;
	}
	public Student() {
		super();
		
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", aadharNo=" + aadharNo + ", address=" + address + ", phoneNo=" + phoneNo + 
				", collegeName=" + collegeName + ", rollNo=" + rollNo + "]";
	}
	

}
