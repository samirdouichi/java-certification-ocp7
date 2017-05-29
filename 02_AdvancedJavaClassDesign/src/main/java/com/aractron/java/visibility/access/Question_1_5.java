package com.aractron.java.visibility.access;

public class Question_1_5 {
	private String s = "Hi";

	/**
	 * Attribut s est private , cependant, puisque la main m?thode est dans la
	 * m?me classe, il peut utiliser l'attribut sans aucun probl?me.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Question_1_5 q = new Question_1_5();
		q.s = "Bye"; // 1
		System.out.println(q.s); // 2
	}

}
