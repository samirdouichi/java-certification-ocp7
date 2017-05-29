package com.aractron.java.inter;

/**
 * Created by user on 21/02/2017.
 */
public abstract class Sort {


    public static void sortObjects(Sortable[] items) {
        // Step through the array comparing and swapping;
        // do this length-1 times
        for (int i = 1; i < items.length; i++) {
            for (int j = 0; j < items.length - 1; j++) {
                if (items[j].compare(items[j + 1]) > 0) {
                    Sortable tempitem = items[j + 1];
                    items[j + 1] = items[j];
                    items[j] = tempitem;
                }
            }
        }
    }
}


