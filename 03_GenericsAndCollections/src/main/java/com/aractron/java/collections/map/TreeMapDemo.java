package com.aractron.java.collections.map;

import java.util.TreeMap;

/**
 * Created by root on 2/26/17.
 */
public class TreeMapDemo {

    public static void main(String args[ ])
    {
        TreeMap tm = new TreeMap( );
        tm.put("name", "S.Nageswara Rao");
        tm.put("email", "surenagrao@yahoo.co.in");

        System.out.println("No. of keys present: " + tm.size( ) );
        System.out.println(tm);
    }
}
