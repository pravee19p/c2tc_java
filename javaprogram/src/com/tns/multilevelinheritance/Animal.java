package com.tns.multilevelinheritance;

public class Animal {

	 protected String name;

	

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void sound()
	{
		System.out.println("animals make sound");
	}
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Animal(String name) {
		// TODO Auto-generated constructor stub
		super();
		this.name=name;}
	@Override
	public String toString() {
		return "Animal [name=" + name + "]";
	}
	 
	  
}
