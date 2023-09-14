package com.tns.exception;

import java.util.Scanner;

public class TestDemo {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter roll no");
		int rollno=sc.nextInt();
		if(rollno<0)
		{
			throw new ArithmeticException("roll no cannot be negative");
		}else {
			System.out.println("valid roll no");
				
		}
	}

}
