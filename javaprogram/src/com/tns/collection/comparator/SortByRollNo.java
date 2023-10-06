package com.tns.collection.comparator;

import java.util.Comparator;

public class SortByRollNo implements Comparator<Student> {

	@Override
	public int compare(Student a, Student b) {
		// TODO Auto-generated method stub
		return b.rollno-a.rollno;
	}

}
