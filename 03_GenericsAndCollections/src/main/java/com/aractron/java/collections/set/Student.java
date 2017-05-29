package com.aractron.java.collections.set;

/**
 * Created by root on 2/26/17.
 */
public class Student {

    String name, division, remarks;
    public Student(String name, String division, String remarks)
    {
        this.name = name;
        this.division = division;
        this.remarks = remarks;
    }
    public String toString( )
    {
        String str = name + " " + division + " " + remarks;
        return str;
    }
}
