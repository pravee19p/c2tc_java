package com.tns.hashset;

import java.util.HashSet;

public class HashsetDemomain {
	
	static void addElements(HashSet<Integer> numberHashSet) {
		
		 numberHashSet.add(76);
		 numberHashSet.add(90);
		 numberHashSet.add(51);
		 numberHashSet.add(30);
		 numberHashSet.add(60);
		 System.out.println(numberHashSet.add(51));
	}
	public static void main(String[]args) {
		HashSet<Integer>numberHashSet=new HashSet<Integer>();
		addElements(numberHashSet);
		HashSet<Integer>numberHashSet1=new HashSet<Integer>();
		numberHashSet1.add(42);
		numberHashSet1.add(52);
		numberHashSet1.add(62);
		numberHashSet1.add(62);
		numberHashSet1.add(30);

		 System.out.println(numberHashSet);
		 System.out.println(numberHashSet1);
		 //union of two sets
		 numberHashSet.addAll(numberHashSet1);
		 System.out.println("resultset:"+numberHashSet);
		 
		
		 numberHashSet.clear();
		 System.out.println("resultset:"+numberHashSet);
		 //intersection of two sets
		 numberHashSet.retainAll(numberHashSet1);
		 System.out.println("resultset:"+numberHashSet);
		 //setdifference
		 numberHashSet1.removeAll(numberHashSet1);
		 System.out.println("resultset:"+numberHashSet1);
		 
	}
}
