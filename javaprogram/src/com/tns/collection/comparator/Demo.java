package com.tns.collection.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {
	public static void main(String[]args)
	{
		ArrayList<Student> ar=new ArrayList<Student>();
		ar.add(new Student(22,"boobesh","chengalpattu"));
		ar.add(new Student(12,"hariharan","kanchipuram"));
		//System.out.println(ar);
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		Collections.sort(ar,new SortByRollNo());
		//System.out.println(ar);
				for(int i=0;i<ar.size();i++) {
					System.out.println(ar.get(i));
				}
	}

}
