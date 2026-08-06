package com.ThreadControl;
class EvenThread extends Thread {

    public void run() {
        System.out.println("Even Numbers:");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

class OddThread extends Thread {

    public void run() {
        System.out.println("Odd Numbers:");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}

public class ThreadsDemo {

    public static void main(String[] args) {

        EvenThread t1 = new EvenThread();
        OddThread t2 = new OddThread();

        t1.start();

        try {
            t1.join();   // Wait until even thread completes
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start();
    }
}
