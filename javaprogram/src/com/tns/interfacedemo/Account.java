package com.tns.interfacedemo;

public class Account {
	private  int accNo;
	private String name;
	private  double balance;
	private Bank b;
	private double amount;
	public Account(int accNo, String name, double balance, Bank b) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
		this.b = b;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Bank getB() {
		return b;
	}
	public void setB(Bank b) {
		this.b = b;
	}
	public void deposit(double amount)
	{
		b.deposit(this, amount);
	}
	public void withdraw(double amount)
	{
		b.withdraw(this, amount);
	}

	
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", balance=" + balance + ", b=" + b + "]";
	}
	
	}

	
	
	

