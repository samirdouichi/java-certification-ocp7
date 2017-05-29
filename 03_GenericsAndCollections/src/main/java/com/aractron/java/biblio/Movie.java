package com.aractron.java.biblio;

/**
 * Created by user on 25/02/2017.
 */
public class Movie extends Item {

    private int year;
    public Movie(String title,
                 int year) {
        super(title);
        this.year = year;
    }
    public Movie(String title) {
        super(title);
    }
    public int getYear() {
        return year;
    }
    public String toString() {
        return "Movie: " + title +
                " (" + year + ")";
    }


}
