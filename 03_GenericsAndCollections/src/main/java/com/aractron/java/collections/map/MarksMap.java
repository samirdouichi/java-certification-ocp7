package com.aractron.java.collections.map;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by root on 2/26/17.
 */
public class MarksMap {
    public static void main(String args[ ])
    {
        String subjects[ ] = { "English", "Maths", "Science", "Social", "Drawing" };
        int i;

        double marks[ ] = { 40, 50, 60, 70, 80 };
        // creating a TreeMap object
        TreeMap tm = new TreeMap( );
        // adding key/value pairs to TreeMap
        for ( i =0; i< subjects.length; i++)
        {
            tm.put(subjects[i], new Double(marks[i]));
        }
        // printing all the values using Iterator
        Set keys = tm.keySet( );
        Iterator it = keys.iterator( );
        while (it.hasNext( ))
        {
            Object obj = it.next( );

            System.out.println(obj + ": " + tm.get(obj));
        }
    }
}
