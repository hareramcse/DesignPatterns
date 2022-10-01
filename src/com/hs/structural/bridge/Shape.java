package com.hs.structural.bridge;

public abstract class Shape {
	// Composition - implementor
	protected Color color;

	abstract public void applyColor();

	// constructor with implementor as input argument
	public Shape(Color c) {
		this.color = c;
	}

}
