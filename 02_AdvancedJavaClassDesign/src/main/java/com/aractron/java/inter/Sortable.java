package com.aractron.java.inter;

/**
 * Created by user on 21/02/2017.
 */
public interface Sortable {

    // compare(): Compare this object to another object
    // Returns:  //    0 if this object is equal to obj2
    //    a value < 0 if this object < obj2
    //    a value > 0 if this object > obj2
    int compare(Object obj2);

}
