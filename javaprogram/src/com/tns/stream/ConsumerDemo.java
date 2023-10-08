package com.tns.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> cities=new ArrayList<>();
		cities.add("mumbai");
		cities.add("hydrabad");
		cities.add("chennai");
		System.out.println(cities);
		Consumer<String>printconsumer=city->System.out.println(city);
		cities.forEach(printconsumer);
	}

}
