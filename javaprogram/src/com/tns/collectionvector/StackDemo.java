package com.tns.collectionvector;
import java.util.Stack;
public class StackDemo {
	public static void main(String[]args) {
	Stack<Integer>o=new Stack<Integer>();
	o.push(22);
	o.push(2);
	o.push(90);
	System.out.println("elements of the Stack"+o);
	o.pop();
	System.out.println("elements of the Stack"+o);
	System.out.println("last element of the stack"+o.peek());
	if(o.isEmpty()) {
		System.out.println("stack is empty");
		
	}
	else {
		System.out.println("stack is not empty");
	
		
	}
	System.out.println(o.search(2));
	System.out.println(o.search(56));
	
	
	
	
	}

}
