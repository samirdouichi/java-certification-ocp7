package com.aractron.java.lab.statice;

public class StaticClass {

	static int attr = 0;

	static int attr1;

	static {

		attr1 = 100;
	}

	public static int getAttr() {
		return attr;
	}

	public static void setAttr(int attr) {
		StaticClass.attr = attr;
	}

	public static void printAttr() {

		System.out.println(getAttr());
	}
}
