package com.hs.structural.adaptor;

public class StripeAdapter implements PaymentProcessor {
	private Stripe stripe;

	public StripeAdapter(Stripe stripe) {
		this.stripe = stripe;
	}

	@Override
	public boolean processPayment(String customerId, String currency, double amount) {
		// Convert your internal request to Stripe-specific format
		int cents = (int) (amount * 100); // Convert amount to cents as Stripe uses cents
		return stripe.charge(customerId, cents, currency);
	}
}
