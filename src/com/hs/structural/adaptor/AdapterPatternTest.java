package com.hs.structural.adaptor;

public class AdapterPatternTest {
	public static void main(String[] args) {
		PayPal payPal = new PayPal();
		PaymentProcessor paypalProcessor = new PayPalAdapter(payPal);

		// Process payment using PayPal
		paypalProcessor.processPayment("customer123", "USD", 100.0);

		Stripe stripe = new Stripe();
		PaymentProcessor stripeProcessor = new StripeAdapter(stripe);

		// Process payment using Stripe
		stripeProcessor.processPayment("customer456", "USD", 200.0);
	}
}