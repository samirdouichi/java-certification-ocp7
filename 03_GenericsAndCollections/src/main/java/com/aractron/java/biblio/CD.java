package com.aractron.java.biblio;

/**
 * Created by user on 25/02/2017.
 */
public class CD extends Item implements Priced {
    private String cat;

    public CD(String title) {
        super(title);
    }

    public CD(String title,
                String cat) {
        super(title);
        this.cat = cat;
    }

    public double getPrice() {

        return .0;
    }

}
