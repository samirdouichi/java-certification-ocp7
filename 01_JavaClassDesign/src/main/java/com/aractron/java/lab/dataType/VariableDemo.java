package com.aractron.java.lab.dataType;

public class VariableDemo {

	int myAge;
	boolean isAMovie;
	float maxItemCost = 17.98f;
	String customerFirstName;

	/**
	 * Find the error and fix it?
	 */
	// byte sizeof = 200;
	// short mom = 43;
	// short hello mom;
	// int big = sizeof * sizeof * sizeof;
	// long bigger = big + big + big // ouch
	// double old = 78.0;
	// double new = 0.1;
	// boolean consequence = true;
	// boolean max = big > bigger;
	// char maine = "New England state";
	// char ming = 'd';
	/**
	 * Incrementation decrementation
	 */
	int var1 = 3;

	private int instVar; // instance variable
	private int var2;

	public void addItem() {
		float itemCost = 3.50f; // local variable
		int numOfDays = 3; // local variable
		var1++; // var1 now equals 4
		var2 = ++var1; // Prefix: Increment var1 first,
		// then assign to var2.
		var2 = var1++; // Postfix: Assign to var2 first,
		// then increment var1.
	}
}
