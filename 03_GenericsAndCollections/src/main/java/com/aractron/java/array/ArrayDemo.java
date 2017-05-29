package com.aractron.java.array;

import java.lang.reflect.Array;

/**
 * Created by user on 25/02/2017.
 */
public class ArrayDemo {

    private int[] powers;
    private String[] categories;
    private final int LENGHT_OF_ARRAY = 200;

    public ArrayDemo(int[] powers) {
        this.powers = powers;
    }

    public int[] getPowers() {
        return powers;
    }

    public void setPowers(int[] powers) {
        this.powers = powers;
    }

    public void fonction() {
        //initialisation de la longeur du tableau
        powers = new int[LENGHT_OF_ARRAY];
        //Assign values to individual elements:
        powers[0] = 20;
        //Attribuer des valeurs à des éléments individuels:
        int powers[] = {1, 2, 3, 6, 5};
        /**
         * over string values
         */
        //initialisation de la longeur du tableau
        categories = new String[LENGHT_OF_ARRAY];
        //Assign values to individual elements:
        categories[0] = "salut";
        //Attribuer des valeurs à des éléments individuels:
        String categories[] = {"samir", "douichi", "by", "by", "world"};
    }
    public  void fonctionInit(){

        // Create an array of four empty Strings
        String[] arr = new String[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new String();
        }

    }
}
