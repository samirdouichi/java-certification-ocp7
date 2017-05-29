package com.aractron.java.lab.finalP;

import java.util.ArrayList;
import java.util.List;

public class ExampleFinalDemo {

	private final int number = 0;
	// private final int a;
	private final List<Integer> list = new ArrayList<Integer>();
	private final String name;
	private final int total;
	private final int id = 1;

	{
		name = "Name";
	}

	/**
	 * Lorsque final est appliqu�e aux variables, vous ne pouvez pas modifier la
	 * valeur de la variable apr�s son initialisation
	 */
	public ExampleFinalDemo() {
		// System.out.println(a);
		// number = 1; // Compile-time error
		total = 10;
	}

	/**
	 * Bien que l' attribut list est final , ce mot - cl� ne fait que sa
	 * r�f�rence immuable; il ne peut pas �tre attribu� a un autre objet (comme
	 * une nouvelle List ), mais les valeurs � l' int�rieur de l'objet peut
	 * changer (si elles ne sont pas final eux - m�mes). Ce (et d'autres
	 * d�tails) rend la classe mutable.
	 * 
	 * @param e
	 */
	public void addToList(Integer e) {

		list.add(e);
	}

	/**
	 * Lorsque final est appliqu�e aux variables, vous ne pouvez pas modifier la
	 * valeur de la variable apr�s son initialisation Ces variables peuvent �tre
	 * des attributs (statiques et non statiques) ou des param�tres.attributs
	 * finales peuvent �tre initialis�es soit lorsqu'ils sont d�clar�s, �
	 * l'int�rieur d'un constructeur, ou � l'int�rieur d'un bloc
	 * d'initialisation.
	 */
	public void exampleMethod(final int id) {
		// id = 5; // Compile-time error
		// this.id = id; // Compile-time error
	}

}
