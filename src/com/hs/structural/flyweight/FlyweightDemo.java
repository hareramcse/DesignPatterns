package com.hs.structural.flyweight;

public class FlyweightDemo {
	public static void main(String[] args) {
		for (int i = 0; i < 10; ++i) {
			AngryBird angrybird = (AngryBird) BirdFactory.getAngryBird(getRandomColor());
			angrybird.draw();
		}
	}

	private static String getRandomColor() {
		String colors[] = { "Red", "Orange", "Blue", "Yellow", "Pink" };
		return colors[(int) (Math.random() * colors.length)];
	}
}