package com.aractron.java.visibility.runtime;

/**
 * 
 * @author Samir DOUICHI
 *
 */
public class App extends Super {

	public static void main(String[] args) {
		Super app = new App();
		MyClass myClass = new MyClass();
		String aValue = "hello";
		/*
		 * Uncommenting next line causes a compilation error. The method is not
		 * overridden and it's declared "private" in Super class.
		 */
		// app.foo();
		myClass.myField = "samir";
		myClass.myMethod();
		myClass.setMyField2(aValue);

		System.out.println(myClass.getMyField2());
	}

	/*
	 * Here you're not overriding Super.foo because it's declared private. If
	 * you try to uncomment @Override annotation you get a compilation error on
	 * the next line
	 */
	// @Override
	public void foo() {
	}
}

class Super {
	private void foo() {
	}
}