package com.aractron.java.visibility.runtime;

public class MyClass {
	String myField = "you";
	int myField2 = 1;

	
	public MyClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	void myMethod() {
		System.out.println("Hi " + myField);
	}
	/**
	 * 
	 * Mais si nous  cachons l'attribut et utilisons une methode setter � la
	 * place, nous pourrions eviter les  changements:
	 */
	public void setMyField2(String aStringValue) {

		try {
			myField2 = Integer.parseInt(aStringValue);
		} catch (NumberFormatException e) {
			myField2 = 0;
		}
	}
	public String getMyField() {
		return myField;
	}

	public void setMyField(String myField) {
		this.myField = myField;
	}

	public int getMyField2() {
		return myField2;
	}

	public void setMyField2(int myField2) {
		this.myField2 = myField2;
	}



}
