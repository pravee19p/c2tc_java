package com.tns.collection;

public class DemoGenericClass {
	public static void main(String[]args) {
		
		//generic class with string type datamember
	GeneriClass<String>st=new GeneriClass<String>();
	st.set("hello");
	System.out.println(st.get());
	
	GeneriClass<Integer>s=new GeneriClass<Integer>();
	s.set(2);
	System.out.println(s.get());
	
	
		
		
		
		
	}

}
