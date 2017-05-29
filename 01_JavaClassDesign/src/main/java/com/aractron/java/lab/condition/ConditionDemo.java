package com.aractron.java.lab.condition;

/**
 * Created by user on 20/02/2017.
 */
public class ConditionDemo {

    boolean condition = true;
    private float vitesse;

    public ConditionDemo() {
        if (condition == true) {
            //liste d 'instruction

        } else {

            //liste d 'instruction
        }
    }

    public boolean methode() {

        if (vitesse >= 25)
            if (vitesse > 65)
                System.out.println("Vitesse sup a  65");
            else
                System.out.println("Vitesse sup a 25");
        else
            System.out.println("Vitesse  moins de 25");
        return true;
    }

    public int bigValueMeth(int a, int b) {

        return (a > b) ? a : b;
    }

}
