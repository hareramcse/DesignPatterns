package com.hs.behavioral.proxy;

public class RealBankAccount implements BankAccount {
	private double balance;

	public RealBankAccount(double initialBalance) {
		this.balance = initialBalance;
	}

	@Override
	public void withdraw(double amount) {
		if (amount > balance) {
			System.out.println("Insufficient funds.");
		} else {
			balance -= amount;
			System.out.println("Withdrew " + amount + ". New balance: " + balance);
		}
	}

	@Override
	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposited " + amount + ". New balance: " + balance);
	}

	@Override
	public double getBalance() {
		return balance;
	}
}
