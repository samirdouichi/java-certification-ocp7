package com.aractron.java.iterator;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

/**
 * Created by root on 2/26/17.
 */
public class IteratorDemo {

    public static void main(String args[ ] )
    {
        // create a ArrrayList and add some values
        ArrayList myList = new ArrayList( );

        myList.add(new Integer(10));
        myList.add(new Double(25.5));
        myList.add(new Boolean(false));
        myList.add(new String("SNRao"));
        myList.add(new StringBuffer("Faculty"));
        myList.add(new Date( ));

        Iterator it = myList.iterator( ); 		// to print the elements using Iterator
        while( it.hasNext( ) )
        {
            Object obj = it.next( );      // the next( ) method returns an object of Object
            System.out.println( obj );
            if( obj instanceof Number ) 	  // to remove the elements that are numbers
                it.remove( ); 		          // elements are removed from Iterator
        }                                                                                       // and not from ArrayList
        System.out.println("\nAFter deleting strings:");
        System.out.println(myList); 			   // to print all the elements at a time
    }
}
