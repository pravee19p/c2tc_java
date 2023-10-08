package com.tns.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class Streamapiprograms {
	
	public void operations(){
		Stream<Integer> st= Stream.of(10,20,30,40,50,60,70,80,90);
			//counting no of elements
			 //  System.out.println("no of elements:"+st.count());
		 st.forEach(System.out::println);
		
		//create a stream from array
		  Integer[]values=new Integer[]{10,20,3,25,2,5,7};
		  st=Arrays.stream(values);
		  System.out.println("Squares of"+Arrays.toString(values));
		
		
		}

}
