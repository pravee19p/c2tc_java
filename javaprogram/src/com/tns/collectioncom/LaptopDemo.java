package com.tns.collectioncom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LaptopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<LaptopClass>laps=new ArrayList<LaptopClass>();
		laps.add(new LaptopClass("dell",15,170000));
		laps.add(new LaptopClass("hp",12,160000));
		laps.add(new LaptopClass("apple",25,270000));
		
		Collections.sort(laps);
		for(LaptopClass l:laps) {
		System.out.println(l);

	}
	}
}
