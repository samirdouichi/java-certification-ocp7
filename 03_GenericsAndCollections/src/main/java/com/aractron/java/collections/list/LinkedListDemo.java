package com.aractron.java.collections.list;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by user on 25/02/2017.
 */
public class LinkedListDemo {

    LinkedList list = new LinkedList();

    public void addElement() {

        Integer i1 = new Integer(5);
        list.add(i1);
        list.add(new Double(3.5));
        list.add(" Hello ");
        list.add(new Boolean(true));

        list.add(0, new Float(2.3f));          //  to add an element at the specified index

        list.addFirst(new Character('A'));          //  to add the element as the first one
        list.addLast(new Short(" 5 "));                  // to add the element as the last one
        list.add(i1);                                           // same element can be added any times
        list.add(new Byte("3")); // must be kept in quotes or error as 3 will be treated as int
        list.set(2, " S N Rao ");                 // replaces the element at the specified index
    }

    // removing methods
    public void removeElement() {
        list.remove(1);                              // removes the element at the specified index
        list.removeFirst();     //  this method returns object and can be printed as follows
        // Sytem.out.println( "First element removed: " + removeFirst( ) ) ;
        list.removeLast();  // this method also returns object and can be printed as above
        // also contains the methods removeAll( ) (or clear( ) ) and  removeRange( int, int )
    }

    // to get the elements
    public void getElement(int i1) {
        System.out.println(" Index of i1 element : " + list.indexOf(i1));
        System.out.println(" Last index of i1 element: " + list.lastIndexOf(i1));

        System.out.println(" Object at index 1: " + list.get(1));  // returns object at the
        System.out.println(" First element: " + list.getFirst());            // specified index
        System.out.println(" Last element: " + list.getLast());
    }

    // miscellaneous methods
    public void getLinkedSize()

    {
        System.out.println(" Size of the Linked list: " + list.size());
    }

    public void isElementExist(int i1) {
        System.out.println(" i1 object exists: " + list.contains(i1));
    }

    public void isEmpty() {
        System.out.println(" List is empty: " + list.isEmpty());
    }

    // to print the elements with ListIteator: ( ListIterator is a subclass of Iterator ). Iterator also works
    public void printElement() {
        System.out.println(" \n Printing the elements through an iterator ");
        ListIterator li = list.listIterator();
        // listIterator(int index) prints the elements from the
        while (li.hasNext())                                                                    // specified index
            System.out.println(li.next());
    }

    public void printElementWithArray() {
// to print the elements with an array

        System.out.println(" \n Printing the elements through an array ");
        Object objarray[] = list.toArray();
        for (int i = 0; i < objarray.length; i++)
            System.out.println(objarray[i]);
    }
}

