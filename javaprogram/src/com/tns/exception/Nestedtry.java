package com.tns.exception;

public class Nestedtry {
	 public static void check()
	 {
	 String str="hello";
	 int slength=str.length();
	 System.out.println("String length"+slength);
	 String anotherstring=null;
	 int y=6;
	 try {
		 try
		 {
			 System.out.println(str.charAt(y));//exception occured
			 
		 }catch(StringIndexOutOfBoundsException ex) {
			 System.out.println("indexoutofbound"+ex.getMessage());
		 }
		 System.out.println("String Length"+anotherstring.length());
	 }catch(NullPointerException ex)
	 {
		 System.out.println("exception is thrown"+ex.getMessage());	 }
	 }

}
