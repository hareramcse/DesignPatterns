package com.hs.creational.singleton;

enum Customer {
	INSTANCE;

	private String name;
	private String email;

	private Customer() {
		this.name = "Default Name";
		this.email = "default@example.com";
	}

	public String getDetails() {
		return "Name: " + name + ", Email: " + email;
	}

	public void printDetails() {
		System.out.println("Customer Details: " + getDetails());
	}
}

public class SingletonByEnum {
	public static void main(String[] args) {
		Customer customer = Customer.INSTANCE;
		customer.printDetails();

		// Access the same instance again to show that it's a singleton
		Customer anotherReference = Customer.INSTANCE;
		anotherReference.printDetails();

		// Confirm that both references point to the same instance
		System.out.println("Are both references the same instance? " + (customer == anotherReference));
	}
}