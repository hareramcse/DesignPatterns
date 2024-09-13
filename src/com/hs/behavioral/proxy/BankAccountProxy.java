package com.hs.behavioral.proxy;

public class BankAccountProxy implements BankAccount {
	private RealBankAccount realBankAccount;
	private String userRole;

	public BankAccountProxy(RealBankAccount realBankAccount, String userRole) {
		this.realBankAccount = realBankAccount;
		this.userRole = userRole;
	}

	@Override
	public void withdraw(double amount) {
		if ("ADMIN".equals(userRole)) {
			realBankAccount.withdraw(amount);
		} else {
			System.out.println("Access denied. You do not have permission to withdraw funds.");
		}
	}

	@Override
	public void deposit(double amount) {
		if ("ADMIN".equals(userRole)) {
			realBankAccount.deposit(amount);
		} else {
			System.out.println("Access denied. You do not have permission to deposit funds.");
		}
	}

	@Override
	public double getBalance() {
		// Allow all roles to view the balance
		return realBankAccount.getBalance();
	}
}
