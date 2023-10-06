package com.tns.collectionvector;

import java.util.ArrayList;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[]args)
	{
		Vector<String> v=new Vector<String>();
		int size=v.size();
		System.out.println("Size of vector"+size);
		//adding the elements
		v.add("red");
		v.add("blue");
		v.add("black");
		v.add("orange");
		System.out.println("vector elements"+v);
		int Size=v.size();
		System.out.println("Size f vector"+Size);
		int cap=v.capacity();
		System.out.println("default capacity"+cap);
		v.addElement(null);//null elements are allowed
		v.add(5,"pink");
		v.add("black");//duplicates are allowed
		int newsize=v.size();
		System.out.println("size of the vector"+newsize);
		System.out.println("vector element"+v);
		
		//creating and ArrayList with initial capacity 10
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("apple");
		al.add("banana");
		v.add("red");
		v.add("blue");
		v.add("black");
		v.add("orange");
		//calling addall method()to add collection of elements
		//to vector
		
		v.addAll(al);
		System.out.println("vector elements"+v);
		System.out.println(" new capacity:"+v.capacity());
		
		
		
		
		
		
		
	}

}


