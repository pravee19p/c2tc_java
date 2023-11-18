package newpro;

import java.util.Scanner;

public class SetGet {
	private static String name;

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
				System.out.println("enter ur name");
		String name=sc.nextLine();
		System.out.println("enter ur age");
		int age=sc.nextInt();

		Student stud=new Student();
	//	ntSetGet s=new SetGet();
		stud.name=name;
		stud.setAge(age);
		//System.out.println("Invalid age");
		//System.out.println("name:"+stud.name);
		System.out.println("age:"+ stud.getAge());

		
	}

	
}
class Student{

	public   String name;
	public int age;
	
	public int getAge() {
		if(age<=0)
		{
			System.out.println("Invalid age");
			System.out.println("Name:"+name);
			return 0;
		}
		return age;
	}
	public void setAge(int age) {
		if(age>=0) {
			System.out.println("Name:"+name);
		this.age = age;
	}
	
	}	
	}
	

