package com.hs.behavioral.state;

public class StateDesignPatternTest {
	public static void main(String[] args) {
		DeliveryContext ctx = new DeliveryContext(null, "Test123");
		ctx.update(ctx);
		ctx.update(ctx);
		ctx.update(ctx);
		ctx.update(ctx);
		ctx.update(ctx);
	}
}