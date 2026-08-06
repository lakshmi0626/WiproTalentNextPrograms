package com.multithreading;
import java.util.Random;

class ColourThread implements Runnable {

    String colours[] = {"white", "blue", "black", "green", "red", "yellow"};

    public void run() {

        Random random = new Random();

        while (true) {

            int index = random.nextInt(colours.length);
            String colour = colours[index];

            System.out.println(colour);

            if (colour.equals("red")) {
                System.out.println("Red found. Thread stopped.");
                break;
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ColorDemo {

    public static void main(String[] args) {

        Thread t = new Thread(new ColourThread());

        t.start();
    }
}