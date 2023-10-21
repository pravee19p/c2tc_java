package com.tns.threadprogs;

//import tns.com.threadprog.ImplementingRunnable;

public class Runnableprog implements Runnable {
     
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("implementing  runnable");
	}
	public static void main(String[]args)
	{
		Runnableprog t=new Runnableprog();
		//t.start();
		Thread t1=new Thread(t);
		t1.start();
	}

}
