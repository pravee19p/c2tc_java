package com.tns.consprgms;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	public static void main(String[]args) {
		
		ApplicationContext con=new ClassPathXmlApplicationContext("bean.xml");
		Student st=con.getBean("student",Student.class);
		st.display();
		
	}

}
