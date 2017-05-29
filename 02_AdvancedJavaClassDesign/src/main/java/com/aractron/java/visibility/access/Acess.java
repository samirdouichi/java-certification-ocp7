package com.aractron.java.visibility.access;

import com.aractron.java.visibility.access.acmeTools.Tools;
import com.aractron.java.visibility.access.acmeVideo.Video;

public class Acess {

	public static void main(String[] args) {
		// Every object is an instance of some class.

		Video videoInstance = new Video();
		Tools toolsInstance = new Tools();
		// objet videoInstance_1 reference null
		Video videoInstance_1 = null;

		videoInstance.displayDetails();

		if (videoInstance_1 == null) {
			videoInstance = new Video();

		} else
			videoInstance_1.displayDetails();

		/**
		 * Private instance variables can be accessed by using accessors and
		 * mutators mais les attributs public peuvent etres simplement acceder
		 * par l'operateur point
		 */
		if (videoInstance.getTitle().equals("Gone ... "))
			videoInstance.setRating("PG");

		/**
		 * Call a class method by using the class name or an object reference.
		 * 
		 */
		Video.increaseMinPrice(0.5);
		videoInstance.increaseMinPrice(0.6);
	}

}
