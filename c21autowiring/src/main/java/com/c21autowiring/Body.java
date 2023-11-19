package com.c21autowiring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Body {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con=new ClassPathXmlApplicationContext("bean.xml");
		System.out.println("config loaded");
		Human b=con.getBean("human",Human.class);
		b.startpumping();

	}

}
