package com.exception;

import java.util.Scanner;

/*User Defined exception class must inherit Exception class
 * 
 * throw :
 * 1. must be written inside method
 * 2. throw followed by new and constructor
 * 
 * 
 * throws :
 * 1. must be written after method declaration
 * 
 * balance :2000
 * deposit :1000
 * balance+=deposit
 * withdraw =5000
 * balance-=withdraw
 * 
 * if you deposit 2000 more you can withdraw 5000 
 * amount-balance
 * 5000-3000
 */

class TanviException extends Exception{
	double amount;
	public TanviException(double amount) {
		this.amount=amount;
	}
}
class ATM{
	double balance;
	
	public void deposit(double amount) {
		balance+=amount;
		System.out.println("your current balance is :"+balance);
	}
	
	public void withdraw(double amount) throws TanviException {
		if(amount<=balance) {
			balance-=amount;
			System.out.println("withdraw amount :"+amount+" \n your current balance is :"+balance);
		}else {
			double needs=amount-balance;
			throw new TanviException(needs);
		}
		
		
	}
}
public class UserDefinedException {
public static void main(String[] args) {
	ATM atm=new ATM();
	Scanner sc=new Scanner(System.in);
	double amount;
	
	System.out.println("Enter amount to be deposited : ");
	amount=sc.nextDouble();
	atm.deposit(amount);
	
	System.out.println("Enter amount to be withdrawn : ");
	amount=sc.nextDouble();
	try {
		atm.withdraw(amount);
	} catch (TanviException e) {
		System.out.println("If you deposit "+e.amount+" more you can withdraw "+amount);
	}
}
}
