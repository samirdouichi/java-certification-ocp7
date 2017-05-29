package com.aractron.java.lab.statice;

public class AppStatic {

	public static void main(String[] args) {
		StaticClass staticClass = new StaticClass();
		staticClass.attr = 100;
		staticClass.printAttr();
		staticClass.attr1 = 1000;

		System.out.println(staticClass.attr1);
	}

}
