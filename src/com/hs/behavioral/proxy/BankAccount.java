package com.hs.behavioral.proxy;

public interface BankAccount {
	void withdraw(double amount);

	void deposit(double amount);

	double getBalance();
}
