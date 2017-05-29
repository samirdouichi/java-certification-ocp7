package com.aractron.java.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 25/02/2017.
 */
public class Liberary {

    public static void main(String[] args) {
        List<Item> items = new ArrayList();
        populate(items);
        list(items);
    }

    public static void populate(List items) {
        items.add(new Movie("Psycho", 1960));
        items.add(new Book("LOTR", "Toklien"));
        items.add(new CD("java auto", "XXX"));
    }

    public static void list(List items) {
        for (int i = 0; i < items.size(); i++) {
            Item item = (Item) items.get(i);
            System.out.println(i + ": " + item.getTitle());
        }

    }
}