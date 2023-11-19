package com.tns.c21;

public class Airtel implements Sim{

	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("calling");
	}

	@Override
	public void data() {
		// TODO Auto-generated method stub
		System.out.println("data");
	}
	public Airtel()
	{
			System.out.println(" airtel constructor ");
	}
}
