<<<<<<< HEAD
package com.Thread;

import java.util.Random;

class ColourThread implements Runnable {

    public void run() {

        String colours[] = {"White", "Blue", "Black", "Green", "Red", "Yellow"};

        Random random = new Random();

        while (true) {

            int index = random.nextInt(colours.length);

            System.out.println(colours[index]);

            if (colours[index].equals("Red")) {
                System.out.println("Red colour found. Stopping...");
                break;
            }
        }
    }
}

public class ColorDemo {

    public static void main(String[] args) {

        ColourThread obj = new ColourThread();

        Thread t = new Thread(obj);

        t.start();
    }
=======
package com.Thread;

import java.util.Random;

class ColourThread implements Runnable {

    public void run() {

        String colours[] = {"White", "Blue", "Black", "Green", "Red", "Yellow"};

        Random random = new Random();

        while (true) {

            int index = random.nextInt(colours.length);

            System.out.println(colours[index]);

            if (colours[index].equals("Red")) {
                System.out.println("Red colour found. Stopping...");
                break;
            }
        }
    }
}

public class ColorDemo {

    public static void main(String[] args) {

        ColourThread obj = new ColourThread();

        Thread t = new Thread(obj);

        t.start();
    }
>>>>>>> a2439d6e241a9d503c1d6f83a021267228b45fc4
}