package com.sujeet.assignment_04dec;

public abstract class Bank {
	abstract void transferAmount(int amount, Account ac1, Account ac2) throws Myexception;
	abstract void depositAmount(int amount);
	abstract void calcInterest();
	abstract void showBalance();
}
