package com.aractron.java;

/**
 * Created by user on 01/03/2017.
 */
public class Interruption extends Thread {


    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("task");
        } catch (InterruptedException e) {
            throw new RuntimeException("Thread interrupted..." + e);
        }

    }
    public void isIntrrupted() throws InterruptedException{

        if (this.interrupted()) {
            throw new InterruptedException();
        }


    }

    public static void main(String args[]) {
        Interruption t1 = new Interruption();
        t1.start();

        try {
            t1.interrupt();
        } catch (Exception e) {
            System.out.println("Exception handled " + e);
        }

    }
}