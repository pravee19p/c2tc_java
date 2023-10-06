package com.tns.hashset;

import java.util.HashSet;


public class HashsetDemo {

	public static void main(String[]args) {
		HashSet<Integer> hashset=new HashSet<Integer>();
		hashset.add(100);
		hashset.add(234);
		hashset.add(180);
		hashset.add(4);
		hashset.add(10);
		hashset.add(34);
		System.out.println("result Set1 :"+hashset);
		HashSet<Integer> hashset1=new HashSet<Integer>();
		hashset1.add(67);
		hashset1.add(80);
		hashset1.add(4);
		hashset1.add(79);
		hashset1.add(34);
		hashset1.add(42);
		hashset1.add(91);
		System.out.println("result Set2 :"+hashset1);
		//set difference of two sets
		hashset.removeAll(hashset1);
		System.out.println("difference of two sets:"+hashset);
		 //union of two sets
		HashSet<Integer> union=new HashSet<Integer>();
		union.addAll(hashset);
		union.addAll(hashset1);
		System.out.println("Union of two sets:"+union);
		HashSet<Integer> hash1=new HashSet<Integer>();
		HashSet<Integer> hash2=new HashSet<Integer>();
		
		//intersection of two sets
		hash1.add(2);
		hash1.add(90);
		hash1.add(35);
		hash1.add(64);
		System.out.println("result set1:"+hash1);
		
		hash2.add(2);
		hash2.add(38);
		hash2.add(35);
		hash2.add(6);
		System.out.println("result set2:"+hash2);
		hash1.retainAll(hash2);
		System.out.println("intersection of two sets:"+hash1);
		
		
		
		

		
	}
}
