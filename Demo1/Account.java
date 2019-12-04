package com.sujeet.assignment_04dec;

public class Account extends Bank {

	private int balance;

	public Account() {
		balance = 5000;
	}

	public void transferAmount(int amount, Account ac1, Account ac2)throws Myexception {
		if (amount > ac1.balance) {
			throw new Myexception("Insufficient Fund"); 
		}else {
		ac1.balance -= amount;
		ac2.balance += amount;
	}}

	public void depositAmount(int amount) {
		balance += amount;
	}

	public void withdrawlAmount(int amount) throws Myexception {
		if (amount > balance) {
			throw new Myexception("******Insufficient Fund********");
		} else {
			balance -= amount;
		}
	}

	public void showBalance() {
		System.out.println(balance);
	}

	public void calcInterest() {

	}

	public static void main(String args[]) throws Myexception  {
		Account ac1 = new Account();
		ac1.depositAmount(2000);
		ac1.withdrawlAmount(1000);
		ac1.showBalance();
		Account ac2 = new Account();
		ac2.depositAmount(2000);
		ac1.transferAmount(50000, ac1, ac2);
		ac1.showBalance();
		ac2.showBalance();
	}
}
