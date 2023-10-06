package com.tns.collection;

import java.util.ArrayList;

public class Gdi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenericInterface<String> s=new GenericDemoInt();
		ArrayList<String> sl= new ArrayList<String>();
		sl.add("hello");
		sl.add("hii");
		GenericInterface<Integer> i=new GenericInt();
		ArrayList<Integer> in=new ArrayList<Integer>();
		in.add(3);
		in.add(78);
		for(String st:sl) {
			s.get(st);
		}
		for(Integer t:in)
		{
			i.get(t);
		}
		
		
	}

}
