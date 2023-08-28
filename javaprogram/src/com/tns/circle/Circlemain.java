package com.tns.circle;

import java.util.Scanner;

public class Circlemain {

	public static void main(String[] args) {
		// TScanner s=new Scanner(System.in);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the color:");
		String color=sc.nextLine();
		System.out.println("enter the radius:");
		float radius=sc.nextFloat();
		Circle cc=new Circle();
		cc.setColor(color);
		cc.setRadius(radius);
		Circledemo c1=new Circledemo();
		c1.calccircle(cc);
		

	}

}
