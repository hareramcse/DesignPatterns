package com.hs.behavioral.state;

public class StateDesignPatternTest {
	public static void main(String[] args) {
		DeliveryContext ctx = new DeliveryContext(null, "Mobile123");
		ctx.updateState(ctx);
		ctx.updateState(ctx);
		ctx.updateState(ctx);
		ctx.updateState(ctx);
		ctx.updateState(ctx);
	}
}