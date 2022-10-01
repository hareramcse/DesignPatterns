package com.hs.creational.builder;

public class BuilderDesignPatternTest {
	public static void main(String args[]) {
		Cake whiteCake = new Cake.Builder().sugar(1).eggs(2).vanila(2).build();
		System.out.println(whiteCake);
	}
}
