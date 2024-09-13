package com.hs.structural.adaptor;

public class PayPal {
	public boolean sendPayment(String userEmail, double amount) {
		System.out.println("Processing payment via PayPal for user: " + userEmail);
		return true; // Simulate a successful payment
	}
}
