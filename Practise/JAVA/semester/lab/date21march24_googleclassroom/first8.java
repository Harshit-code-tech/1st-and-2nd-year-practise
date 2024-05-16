package semester.lab.date21march24_googleclassroom;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

class rngen implements Runnable {
    private final Random r = new Random();
    private final Set<Integer> genehum = new HashSet<>();

    @Override
    public void run() {
        try {
            int count = 0;
            while (count < 10) {
                int number;
                do {
                    number = r.nextInt(100);
                } while (genehum.contains(number));

                genehum.add(number);
                System.out.println("Generated number: " + number);

                if (number % 2 == 0) {
                    new Thread(new sqcall(number)).start();
                } else {
                    new Thread(new cucall(number)).start();
                }
                Thread.sleep(500);
                count++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class sqcall implements Runnable {
    private final int number;

    public sqcall(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Square of " + number + ": " + (number * number));
    }
}

class cucall implements Runnable {
    private final int number;

    public cucall(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Cube of " + number + ": " + (number * number * number));
    }
}

public class first8 {
    public static void main(String[] args) {
        Thread t = new Thread(new rngen());
        t.start();
        try {
            t.join();
            System.out.println("Program completed.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}