package com.tns.exception;

public class UserDefined   {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try {
				UserDemo.validate();
			
			}catch(Age e) {
				System.out.println("caught Exception"+e);
			}
	}

}
