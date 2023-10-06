package com.tns.collection;

import java.util.ArrayList;
import java.util.Iterator;


public class arraylist {
	
	public static void main(String[]args) {
		
		//int ArrayList[]=new int[];
		ArrayList list1=new ArrayList();//empty raw array list
		System.out.println(list1.isEmpty());
		System.out.println("size="+list1.size());
		list1.add(20);
		list1.add('a');
		list1.add(22.5);
		System.out.println("size="+list1.size());
		System.out.println(list1);
		System.out.println(list1.contains(55));
		System.out.println("size="+list1.get(1));
		System.out.println("size="+list1.remove(1));
		System.out.println(list1);
		list1.add(90);
		list1.add('b');
		System.out.println(list1);
		System.out.println("size="+list1.remove(list1.indexOf(20)));
		System.out.println(list1);
		ArrayList<String>ob=new ArrayList<String>();
		ob.add("rtu");
		ob.add("suma");
		System.out.println(ob);
		Iterator<String>l=ob.iterator();
		while(l.hasNext()) {
			String nm=l.next();
			System.out.println(nm);
		}
		
		
//		System.out.println("size="+list1.remove(list1.lastIndexOf(2)));
//		System.out.println(list1);
		
			//System.out.println("sorted list="+list1.sort());
		
		//for(int i=0;i<ArrayList)
	}

}
