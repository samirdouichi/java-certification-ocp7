package com.aractron.java.lab;

/**
 * Created by user on 21/02/2017.
 */
public class Movie extends InventoryItem {

    // Additional methods and attributes, to distinguish a
    // Movie from other types of InventoryItem
    private String title;
    private int length;

    public Movie() {

        super();
    }

    public Movie(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public Movie(float price, String condition, String title, int length) {
        super(price, condition);
        this.title = title;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }



  }