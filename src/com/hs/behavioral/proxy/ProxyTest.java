package com.hs.behavioral.proxy;

public class ProxyTest {
	public static void main(String[] args) {
		RealBankAccount realAccount = new RealBankAccount(1000.00);

		// Create proxies for different user roles
		BankAccount adminAccount = new BankAccountProxy(realAccount, "ADMIN");
		BankAccount userAccount = new BankAccountProxy(realAccount, "USER");

		// Admin operations
		adminAccount.deposit(500.00);
		adminAccount.withdraw(200.00);
		System.out.println("Admin Balance: " + adminAccount.getBalance());

		// User operations
		userAccount.deposit(100.00); // Should be denied
		userAccount.withdraw(100.00); // Should be denied
		System.out.println("User Balance: " + userAccount.getBalance());
	}
}
