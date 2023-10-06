package com.tns.lamdaprograms;

import java.util.ArrayList;

public class LambdaCollections {
	public static void main(String[]args) {
		ArrayList<Integer>li=new ArrayList<>();

		li.add(20);
		li.add(21);
		li.add(25);
//		for(Integer el:li) {
//			System.out.println(el);
//		}
		li.forEach(ele->System.out.println(ele));
		
	}

}
