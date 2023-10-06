package com.tns.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperations {
	
	
	public void operations(){
	Stream<Integer> st= Stream.of(10,20,30,40,50,60,70,80,90);
		//counting no of elements
		 //  System.out.println("no of elements:"+st.count());
	 //s st.forEach(System.out::println);
	
	//create a stream from array
	  Integer[]values=new Integer[]{10,20,3,25,2,5,7};
	  st=Arrays.stream(values);
	  System.out.println("Squares of"+Arrays.toString(values));
	  st.map(num->num*num).forEach(System.out::println);
	 // Stream<Integer>Stream=Arrays.stream()
	
	//limit returns first n element
	  System.out.println("First two elements");
	  Arrays.stream(values).limit(2).forEach(System.out::println);
	  
	  //skipping first n elements
	  System.out.println("skipping First three elements");
	  Arrays.stream(values).skip(3).forEach(System.out::println);
	/*  
	 List<String> words=Arrays.asList("hello","stream");
	 //words.add("hii");//list is immutable
	 words.forEach(System.out::println);
	 Stream<String> stream1=words.stream();
	 System.out.println("String in uppercase");
//	 List<String>s1=stream1.map(str->str.toUpperCase).collect(Collector);
	*/
	}

}
