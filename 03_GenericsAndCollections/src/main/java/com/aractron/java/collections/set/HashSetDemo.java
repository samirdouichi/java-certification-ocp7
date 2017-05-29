package com.aractron.java.collections.set;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by root on 2/26/17.
 */
public class HashSetDemo {

    public static void main(String args[])
    {
        HashSet hs = new HashSet( );
        Integer i1 = new Integer(10);
        hs.add(i1);
        Double d1 = new Double(10.5);
        hs.add(d1);
        hs.add(new Integer(20));
        hs.add("S N Rao");
        hs.add(new String("Author"));

        System.out.println("Number of elements: " + hs.size( ));
        System.out.println("i1 exists: " + hs.contains(i1));

        System.out.println("Elements before removal");
        System.out.println(hs);

        hs.remove(d1);
        System.out.println("Elements after removal");
        System.out.println(hs);
        Iterator it=hs.iterator();

        while (it.hasNext()){
            System.out.println(hs.toString());
            it.next();
        }
    }
}
