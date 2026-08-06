package com.project2;

class RaceRunner implements Runnable {
    // Shared flag to track if the race has a winner
    private static volatile boolean winnerDeclared = false;
    private static String winnerName = "";

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();

        for (int meters = 1; meters <= 100; meters++) {
            // Stop running if another thread has already won
            if (winnerDeclared) {
                break;
            }

            System.out.println(threadName + " ran " + meters + " meters.");

            // Requirement (c): Hare sleeps for 1000 ms at 60 meters
            if (threadName.equalsIgnoreCase("Hare") && meters == 60) {
                try {
                    System.out.println("\n--- Hare decides to sleep at 60 meters for 1000 ms ---\n");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Hare was interrupted during sleep.");
                }
            }

            // Check for winner
            if (meters == 100 && !winnerDeclared) {
                synchronized (RaceRunner.class) {
                    if (!winnerDeclared) {
                        winnerDeclared = true;
                        winnerName = threadName;
                        System.out.println("\n=================================");
                        System.out.println("WINNER: " + winnerName + " won the race!");
                        System.out.println("=================================\n");
                    }
                }
            }

            // Yield slightly to give both threads execution time
            Thread.yield();
        }
    }
}

public class RaceMain {
    public static void main(String[] args) {
        RaceRunner runner = new RaceRunner();

        // Create the two threads
        Thread hare = new Thread(runner, "Hare");
        Thread tortoise = new Thread(runner, "Tortoise");

        // Requirement (b): Set priorities using Thread static constants
        hare.setPriority(Thread.MAX_PRIORITY);     // Priority 10
        tortoise.setPriority(Thread.MIN_PRIORITY); // Priority 1

        System.out.println("Starting Race: " + hare.getName() + " vs " + tortoise.getName());
        System.out.println("Hare Priority: " + hare.getPriority());
        System.out.println("Tortoise Priority: " + tortoise.getPriority());
        System.out.println("----------------------------------------------\n");

        // Requirement (a): Start both threads
        hare.start();
        tortoise.start();
    }
}