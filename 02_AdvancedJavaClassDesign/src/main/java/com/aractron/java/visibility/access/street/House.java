package com.aractron.java.visibility.access.street;

public class House {

	protected int number;
	private String reference;

	// Default
	void printNumber() {
		System.out.println("Num: " + number);
	}

	// Public
	public void printInformation() {
		System.out.println("Num: " + number);
		System.out.println("Ref: " + reference);
	}

}
