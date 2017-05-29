package com.aractron.java;

/**
 * Created by user on 01/03/2017.
 */

//The join() method waits for a thread to die. In other words,
// it causes the currently running threads to stop executing until
// the thread it joins with completes its task.
public class Join extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String args[]) {
        Join t1 = new Join();
        Join t2 = new Join();
        Join t3 = new Join();
        t1.start();
        try {
            t1.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        t2.start();
        t3.start();
    }
}