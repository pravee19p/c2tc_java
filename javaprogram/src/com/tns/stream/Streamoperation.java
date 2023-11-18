package com.tns.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class Streamoperation {
	
	
	public void operations(){
	Stream<Integer> st= Stream.of(10,20,30,40,50,60,70,80,90);
		//counting no of elements
		 //  System.out.println("no of elements:"+st.count());
	 st.forEach(System.out::println);
	
	//create a stream from array
	  Integer[]values=new Integer[]{10,20,3,25,2,5,7};
	  st=Arrays.stream(values);
	  System.out.println("Squares of"+Arrays.toString(values));
	   st.map(num->num*num) .forEach(System.out::println);
	
	//limit returns first n element 
	   System.out.println("first 2 elements");
	   Arrays.stream(values).limit(2).forEach(System.out::println);
	   //skip
	   System.out.println(" skipping first 3 elements");
	   Arrays.stream(values).skip(3).forEach(System.out::println);
	}
	
	}


