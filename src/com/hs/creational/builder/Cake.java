package com.hs.creational.builder;

public class Cake {
	private double sugar;
	private int eggs;
	private int vanila;
	private int cherry;

	public static class Builder {
		private double sugar;
		private int eggs;
		private int vanila;
		private int cherry;

		// builder methods for setting property
		public Builder sugar(double cup) {
			this.sugar = cup;
			return this;
		}

		public Builder eggs(int number) {
			this.eggs = number;
			return this;
		}

		public Builder vanila(int spoon) {
			this.vanila = spoon;
			return this;
		}

		public Builder cherry(int number) {
			this.cherry = number;
			return this;
		}

		// return fully build object
		public Cake build() {
			return new Cake(this);
		}
	}

	// private constructor to enforce object creation through builder
	private Cake(Builder builder) {
		this.sugar = builder.sugar;
		this.eggs = builder.eggs;
		this.vanila = builder.vanila;
		this.cherry = builder.cherry;
	}

	@Override
	public String toString() {
		return "Cake{" + "sugar=" + sugar + ", eggs=" + eggs + ", vanila=" + vanila + ", cherry=" + cherry + '}';
	}
}
