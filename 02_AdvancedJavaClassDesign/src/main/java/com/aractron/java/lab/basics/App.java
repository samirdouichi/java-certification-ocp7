package com.aractron.java.lab.basics;

/**
 * 
 * @author Samir DOUICHI
 *
 */
public class App {

	public static void main(String[] args) {
		C c = new C();
	 
	}
	
}

interface MyInt{
	/*
	 * All variables are by default static and final
	 */
    int i = 9;
	void foo();
	void foo2();
}

abstract class MyAbs implements MyInt{
	/*
	 * an abstract method must be explicitly defined as "abstract"
	 */
	abstract void bar();
	/*
	 * a concrete method
	 */
	void concrete(){}
}

/*
 * The first concrete class in the hierarchy is required to implement
 * all the abstract methods
 */
class C extends MyAbs{

	
	public void foo() {}

	@Override
	void bar() {}

	public void foo2() {
		// TODO Auto-generated method stub
		
	}
}