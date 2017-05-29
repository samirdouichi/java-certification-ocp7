package com.aractron.java.visibility.access.acmeVideo;

import java.util.Arrays;
import java.util.List;

public class Video {

	private int id;
	/**
	 * If an access modifier is not specified (default), the variables and
	 * methods may be used by any other class within the same package.
	 */
	String name;
	/**
	 * The least restrictive access modifier is public. Variables and methods
	 * declared as public may be seen and used by any other class.
	 */
	public String aspet;
	/**
	 * Variables and methods declared as protected may be seen from any subclass
	 * of that class. It may also be seen from any class within the package in
	 * which it exists.
	 */
	protected String attribut;

	/**
	 * Attributs de la classe Video
	 */
	private String title;
	private String rating;
	/**
	 * Class variables belong to a class and are common to all instances of that
	 * class.
	 */

	private static double minPrice;

	/**
	 * Constructeur de la classe Video
	 */
	public Video() {

	}

	public Video(Integer it) {
		List<Video> videos = Arrays.asList(this);
		videos.forEach(x -> System.out.println(x.getTitle()));
		List<Integer> sequence = Arrays.asList(1, 2, 3, 5, 8, 7);
		sequence.forEach(x -> {

			x = +3;
			System.out.println(x);
		});

	}

	/**
	 * Class methods are shared by all instances. Useful for manipulating class
	 * variables:
	 * 
	 * @param inc
	 */
	public static void increaseMinPrice(double inc) {
		minPrice += inc;
	}

	/**
	 * Fonction de la classe video
	 */
	public void displayDetails() {

	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the rating
	 */
	public String getRating() {
		return rating;
	}

	/**
	 * @param rating
	 *            the rating to set
	 */
	public void setRating(String rating) {
		this.rating = rating;
	}
}
