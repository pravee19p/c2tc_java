package tns.com.threadprog;

public class Extendingthread extends Thread {
	public void run()
	{
		System.out.println("hello");
	}
	public static void main(String[]args)
	{
		Extendingthread t=new Extendingthread();//new state
		t.start();//runnable state
		
	}

}
