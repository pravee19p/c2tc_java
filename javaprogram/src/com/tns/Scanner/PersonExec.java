package com.tns.Scanner;

import java.util.Scanner;

public class PersonExec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner o = new Scanner(System.in);
			String name;
			System.out.println("enter name:");
			name=o.next();
			System.out.println("enter income");
			int income=o.nextInt();
			
			Person pp=new Person();
			pp.setName(name);
			pp.setIncome(income);
			TaxCalculation calc=new TaxCalculation();
			calc.calculateTax(pp);
			System.out.println("calcualting tax");
			System.out.println(pp);
		}

	}


