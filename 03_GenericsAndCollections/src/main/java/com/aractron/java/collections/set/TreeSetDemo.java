package com.aractron.java.collections.set;

import java.util.TreeSet;

/**
 * Created by root on 2/26/17.
 */
public class TreeSetDemo {

    public static void main(String args[])
    {
        TreeSet ts = new TreeSet( );

        ts.add("S N Rao");
        ts.add("Author");
        ts.add("surenagrao@yahoo.co.in");

        System.out.println("Number of elements present: " + ts.size( ));

        System.out.println(ts);
    }
}
