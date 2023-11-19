package com.c21autowiring;
//program to demonstrate autowiring
public class Human {

	private Heart heart;

	public Human(Heart heart) {
		super();
		this.heart = heart;
		System.out.println("constructor is called");
		
	}
	

	public Human() {
		super();
	}


	public void setHeart(Heart heart) {
		this.heart = heart;
	}
	public void startpumping()
	{
		if(heart!=null)
		{
			heart.pump();
	    }
		else
		{
			System.out.println("you are dead");
		}
	}
	
	
}
