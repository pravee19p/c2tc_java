package com.tns.lamdaprograms;

public class ParametersDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Cube c=(a)->{return a*a*a;};
     System.out.println("cube of the number is "+c.calculate(5));
	

	Square s=(x)->{return(x*x);};
	System.out.println("square of the number is "+s.calc(2));
	}	
}
