package com.tns.lamdaprograms;

import java.sql.Statement;

public class WithoutParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Message s=()->{return "hello";};
		System.out.println(s.greet());
	}

}
