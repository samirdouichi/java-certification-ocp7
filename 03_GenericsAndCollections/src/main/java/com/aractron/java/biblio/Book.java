package com.aractron.java.biblio;

/**
 * Created by user on 25/02/2017.
 */
public class Book extends Item {

    private String author;

    public Book(String title,
                String author) {
        super(title);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public String toString() {
        return "Book: '" + title + "' by " + author;
    }
}


