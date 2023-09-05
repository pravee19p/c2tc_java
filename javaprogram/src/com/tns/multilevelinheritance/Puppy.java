package com.tns.multilevelinheritance;

public class Puppy extends Dog {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	 Puppy()
	 {
		 super();
	 }
public void sound()
{
	System.out.println("bark! bark!");
}
public Puppy(String name,String breed,int age)
{
	super(name,breed);
	this.age=age;
}

@Override
public String toString() {
	return "Puppy [name="+name+",breed="+breed+",age=" + age + "]";
}



}
