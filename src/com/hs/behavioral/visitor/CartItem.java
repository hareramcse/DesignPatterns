package com.hs.behavioral.visitor;

public interface CartItem {
	public int accept(ShoppingCartVisitor visitor);
}

