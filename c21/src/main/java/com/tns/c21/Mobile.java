package com.tns.c21;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
	public static void main(String[]args) {
		
		
		ApplicationContext c=new ClassPathXmlApplicationContext("bean.xml");
		System.out.println("configloaded");
		
	    Sim a=c.getBean("s1",Airtel.class);
		Sim b=c.getBean("s2",Jio.class);
		a.calling();
		a.data();
		b.calling();
		b.data();
		
		
		
		
		
		
		
		
		
		
		
//		Jio a=new Jio();
//		a.calling();
//		a.data();
//		Airtel b=new Airtel();
//		b.calling();
//		b.data();
//		
		
		
	}

}
