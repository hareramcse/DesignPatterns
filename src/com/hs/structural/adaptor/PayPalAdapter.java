package com.hs.structural.adaptor;

public class PayPalAdapter implements PaymentProcessor {
	private PayPal payPal;

	public PayPalAdapter(PayPal payPal) {
		this.payPal = payPal;
	}

	@Override
	public boolean processPayment(String customerId, String currency, double amount) {
		// Convert your internal request to PayPal-specific format
		return payPal.sendPayment(customerId, amount);
	}
}
