package com.hs.structural.adaptor;

public class Stripe {
	public boolean charge(String customerId, int cents, String currency) {
		System.out.println("Processing payment via Stripe for customer ID: " + customerId);
		return true; // Simulate a successful payment
	}
}
