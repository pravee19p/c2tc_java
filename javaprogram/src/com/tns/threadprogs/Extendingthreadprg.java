package com.tns.threadprogs;

//import tns.com.threadprog.Extendingthread;

public class Extendingthreadprg extends Thread {
	public void run()
	{
		System.out.println("hello");
	}
	public static void main(String[]args)
	{
		Extendingthreadprg t=new Extendingthreadprg();//new state
		t.start();//runnable state
		
	}

}
