package com.aractron.java.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 27/02/2017.
 */
public class App {

    public static void main(String[] args) {
        BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
        String s;
        try {
            while((s = in.readLine()).length() != 0)
                System.out.println(s);
        } catch(IOException e) {}
    }
}
