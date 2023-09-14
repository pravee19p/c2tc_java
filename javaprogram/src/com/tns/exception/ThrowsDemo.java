package com.tns.exception;

import java.io.IOException;

public class ThrowsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Throws t=new Throws();
     try {
		Throws.display();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println("caught exception"+e.getLocalizedMessage());
	}
	}

}
