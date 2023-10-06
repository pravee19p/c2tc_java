package com.tns.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
	public static void main(String []args)
	{
		List<Integer> list=Arrays.asList(2,3,4,5,6,5,1,7,9,3,2);
		System.out.println(list);
		List<Integer> distinctnum=list.stream().distinct().collect(Collectors.toList());
		System.out.println("distinct values: "+distinctnum);
		List<Integer> sortednum=list.stream().sorted().collect(Collectors.toList());
		System.out.println("sorted values: "+sortednum);
		
	}
}
