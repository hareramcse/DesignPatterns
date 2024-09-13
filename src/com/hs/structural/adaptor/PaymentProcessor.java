package com.hs.structural.adaptor;

public interface PaymentProcessor {
	boolean processPayment(String customerId, String currency, double amount);
}
