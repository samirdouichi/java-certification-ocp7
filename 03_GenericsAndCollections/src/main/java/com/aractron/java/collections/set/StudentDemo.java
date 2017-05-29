package com.aractron.java.collections.set;

import java.util.LinkedList;

/**
 * Created by root on 2/26/17.
 */
public class StudentDemo {

    public static void main(String args[])
    {
        LinkedList<Student> list = new LinkedList<Student>( );

        list.add(new Student("SNRao", "First", "Promoted"));
        list.add(new Student("Sumathi", "Fail", "Not Promoted"));
        list.add(new Student("Jyostna", "Second", "Promoted"));

        for(Student temp : list)
        {
            System.out.println(temp);
        }
    }
}
