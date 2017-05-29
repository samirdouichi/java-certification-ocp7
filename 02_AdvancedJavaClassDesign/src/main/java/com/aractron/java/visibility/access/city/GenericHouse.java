package com.aractron.java.visibility.access.city;

import com.aractron.java.visibility.access.street.House;

public class GenericHouse extends House {

	public GenericHouse() {
		super();
		// TODO Auto-generated constructor stub

	}

	public static void main(String[] args) {

		GenericHouse h = new GenericHouse();

		/**
		 * h.number compile parce que cet attribut est protected et GenericHouse
		 * peut y acceder car elle etend House .
		 */
		h.number = 100;
		/**
		 * h.reference ne compile pas parce que cet attribut est private .
		 */
		// h.reference = ""; // Compile-time error

		/**
		 * h.printNumber() ne compile pas parce que cette methode a defaut
		 * (package) l' acces.
		 */
		// h.printNumber(); // Compile-time error

		h.printInformation();
		/**
		 * BlueHouse bh = new BlueHouse() ne compile pas parce que la classe a
		 * defaut (package) l' acces.
		 */
		// BlueHouse bh = new BlueHouse(); // Compile-time error

		/**
		 * bh.getColor() ne compile pas parce que bien que la methode est
		 * public , la classe qui contient ne l' est pas.
		 */
		//bh.getColor(); // Compile-time error

	}

}
