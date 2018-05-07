package com.teacher.enumerations.demo_onsite.sample02;

public enum Apple {
	A(10), B(9), C, D(15), E(8);

	// Field - Instance Variables
	private int price; // price of each apple

	// Constructor
	Apple(int p) {
		price = p;
	}

	// Overloaded constructor
	Apple() {
		price = -1;
	}

	// Properties
	public int getPrice() {
		return price;
	}

	// Method
	public String PrintInfo() {
		return "ABC";
	}
}
