package com.tns.constructordi;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext c=new ClassPathXmlApplicationContext("bean.xml");
		Student st=c.getBean("student",Student.class);
		Student st1=c.getBean("student1",Student.class);
		st.display();
		st1.display();
	}

}
