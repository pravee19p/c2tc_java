package com.tns.interfacedemo;

public class Demomain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank=new BankImp();
		Account acc=new Account(123455,"suma",14439,bank);
		acc.deposit(20000);
		System.out.println(acc);
		acc.withdraw(10000);
		System.out.println(acc);
		
	}

}
