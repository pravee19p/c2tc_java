package com.tns.interfacedemo;

public  class BankImp implements Bank {
public void deposit(Account account, double amount)
{
	if(amount>DEPOSIT_LIMIT)
		System.out.println("deposit is not possible");
	else
		account.setBalance(account.getBalance()+amount);
	
}

@Override
public void withdraw(Account account, double amount) {
	// TODO Auto-generated method stub
	if(account.getBalance()-amount>=MIN_BALANCE) 
	{
		account.setBalance(account.getBalance()-amount);
		System.out.println("withdraw"+amount+"from account"+account.getAccNo());
	}
	else
		System.out.println("insufficient balance");
	}
}



