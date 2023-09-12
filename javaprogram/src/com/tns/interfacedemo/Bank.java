package com.tns.interfacedemo;

public interface Bank {

	double MIN_BALANCE=1000;
	double DEPOSIT_LIMIT=25000;
	double INTREST_RATE=7.8;
	void deposit(Account account,double amount);
	void withdraw(Account account,double amount);
		
	
}
