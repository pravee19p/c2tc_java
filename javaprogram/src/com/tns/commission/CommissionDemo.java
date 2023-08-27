package com.tns.commission;

import java.util.Scanner;

public class CommissionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the name:");
		String name=s.nextLine();
		System.out.println("enter the address:");
		String address=s.nextLine();
		System.out.println("enter the phone:");
		long phone=s.nextLong();
		System.out.println("enter the sales_amount:");
		int sales_amount=s.nextInt();
		
		Commission cc=new Commission();
		cc.setName(name);
		cc.setAddress(address);
		cc.setPhone(phone);
		cc.setSales_amount(sales_amount);
		Commissioncalc cal= new Commissioncalc();
		cal.calccommission(cc);
		System.out.println("calcualting commission");
		System.out.println(cc);
		
		
	}

}
