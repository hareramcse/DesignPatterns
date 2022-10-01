package com.hs.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class BirdFactory {
	private static final Map<String, Bird> angryBirdMap = new HashMap<>();

	public static Bird getAngryBird(String color) {
		AngryBird angryBird = (AngryBird) angryBirdMap.get(color);

		if (angryBird == null) {
			angryBird = new AngryBird(color);
			angryBirdMap.put(color, angryBird);
			System.out.println("Creating Angry Bird of color : " + color);
		}
		return angryBird;
	}
}
