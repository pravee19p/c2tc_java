package com.tns.stream;

import java.util.ArrayList;
import java.util.List;

import java.util.function.Predicate;

public class PredicateDemo {
	public static void main(String[]args) {
		
		List<String> cities=new ArrayList<>();
		cities.add("mumbai");
		cities.add("hydrabad");
		cities.add("chennai");
		System.out.println(cities);
		Predicate<String>filtercity=city->city.equals("mumbai");
		cities.stream().filter(filtercity).forEach(System.out::println);
	
	}

}
