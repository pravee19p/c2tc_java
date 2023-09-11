package com.tns.abstraction;

public abstract class Shape {
	protected float area;
	abstract void calcarea();
	
		void show()
		{
			System.out.println("area of the shape is"+area);
		}
	

}
