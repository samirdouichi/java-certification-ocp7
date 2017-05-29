package com.aractron.java.lab.boucle;

/**
 * Created by user on 20/02/2017.
 */
public class ForDemo {

    public static void main(String[] args){
        int[] numbers =
                {1,2,3,4,5,6,7,8,9,10};
        for (int item : numbers) {
            System.out.println("Count is: " + item);
        }
    }
}
