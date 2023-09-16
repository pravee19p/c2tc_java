package tns.com.threadprog;

public class ImplementingRunnable implements Runnable {
     
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("implementing runnable");
	}
	public static void main(String[]args)
	{
		ImplementingRunnable t=new ImplementingRunnable();
		//t.start();
		Thread t1=new Thread(t);
		t1.start();
	}

}
