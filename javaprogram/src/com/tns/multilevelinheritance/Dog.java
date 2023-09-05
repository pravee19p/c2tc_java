package com.tns.multilevelinheritance;

public class Dog extends Animal{
	 protected String breed;

	public String getColor() {
		return breed;
	}

	public void setColor(String breed) {
		this.breed = breed;
	}
	public void sound()
	{
		System.out.println("Dogs bark");
	}
	public Dog(String name,String breed)
	{
		super(name);
		this.breed=breed;
		
	}
	public Dog()
	{
		super();
    }
	@Override
	public String toString() {
		return "Dog[name=" +name+ ",breed=" + breed +"]";
	} 
		
		
	}
	 
	 


