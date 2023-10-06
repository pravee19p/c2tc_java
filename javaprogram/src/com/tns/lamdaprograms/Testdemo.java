package com.tns.lamdaprograms;
//program to demonstrate lamda expression
public class Testdemo {
	public static void main(String[]args) {
	Runnable basic=()->{String threadName=Thread.currentThread().getName();
	System.out.println("Thread name"+threadName);};
	
	Thread thread1=new Thread(basic);
	Thread thread2=new Thread(basic);
	thread1.start();
	thread2.start();
	
	}

}
