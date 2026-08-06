package com.ThreadControl;

class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " : " + i);
        }
        System.out.println(getName() + " completed.");
    }
}

public class ThreadPriorityDemo {

    public static void main(String[] args) {

        MyThread t1 = new MyThread("MAX");
        MyThread t2 = new MyThread("MIN");
        MyThread t3 = new MyThread("NORM");

        t1.setPriority(Thread.MAX_PRIORITY);     // 10
        t2.setPriority(Thread.MIN_PRIORITY);     // 1
        t3.setPriority(Thread.NORM_PRIORITY);    // 5

        t1.start();
        t2.start();
        t3.start();
    }
}