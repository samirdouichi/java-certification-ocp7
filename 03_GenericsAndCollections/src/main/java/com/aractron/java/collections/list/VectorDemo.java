package com.aractron.java.collections.list;

import java.util.Iterator;
import java.util.Vector;

/**
 * Created by user on 25/02/2017.
 */
public class VectorDemo {

    Vector members = new Vector();

    public VectorDemo(Vector members) {
        this.members = members;
    }

    public Vector getMembers() {
        return members;
    }

    public void setMembers(Vector members) {
        this.members = members;
    }

    public void fonction(){

        // Create a vector with 10 elements. The vector // can be expanded later.
        Vector members = new Vector(10);
        Iterator it= members.iterator();
        while(it.hasNext()){

            //do stuf on members
            it.next();
        }

    }
}
