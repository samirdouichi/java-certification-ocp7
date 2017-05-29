package com.aractron.java.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by root on 2/26/17.
 */
public class HashMapDemo {

    public static void main(String args[ ])
    {
        HashMap hm = new HashMap(10, 0.5f );
        hm.put("Rama","Sita");
        hm.put("salary", new Double(9999.99));
        hm.put("distance", new Integer(350));
        hm.put("expenditure", "8888.88");

        System.out.println("Salary key exists: " + hm.containsKey("salary"));
        System.out.println("Sita value exists: " + hm.containsValue("Sita"));
        System.out.println("Value of Rama is " +  hm.get("Rama"));
        System.out.println("No. of elements: " +hm.size( ));
        System.out.println("No. of elements: " +hm.size( ));

        System.out.println("\nPrinting the values using Iterator:");

        Set allKeys = hm.keySet( );
        Iterator It = allKeys.iterator( );
        while (It.hasNext( ))
        {
            Object obj = It.next( );
            System.out.println(obj + " : " + hm.get( obj ));
        }
    }
}
