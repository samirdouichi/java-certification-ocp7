package com.aractron.java.inner;

/**
 * Created by user on 01/03/2017.
 */
public class ThreadLauncher {

    public static void main(String [] args){

        Thread job1 = new Thread(new Job1());
        Thread job2 = new Thread(new Job2());
        job1.start();
        job2.start();
    }

     static class Job1 implements Runnable {

        public void run() {
            // Do some stuff
        }
    }

     static class Job2 implements Runnable {

        public void run() {
            // Do some other stuff
        }
}
}
