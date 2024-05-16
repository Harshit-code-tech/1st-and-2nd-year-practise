package recursion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class tower_of_hanoi {
    static int total_steps = 0;

    public static void tower(int n, String src, String hel, String des) {
        total_steps++;
        if (n == 1) {
            System.out.println("\nTransfering disk : " + n + " from " + src + " to " + des + "\n");
            return;
        }
        tower(n - 1, src, des, hel);
        System.out.println("\nTransfering disk : " + n + " from " + src + " to " + des + "\n");
        tower(n - 1, hel, src, des);
        total_steps++;
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        boolean continueRunning = true;

        while (continueRunning) {
            int m = 0;

            while (true) {
                try {
                    System.out.println("Enter the number of plates: ");
                    m = sc.nextInt();
                    if (m <= 0) {
                        System.out.println("Please enter a positive integer.");
                    } else {
                        break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a positive integer.");
                    sc.nextLine(); // Clear the input buffer
                }
            }

            tower(m, "S", "H", "D");
            System.out.println("FINISHED");
            System.out.println("Total steps executed: " + total_steps);

            total_steps = 0; // Reset the steps counter for the next run

            System.out.println("\nDo you want to run the program again? (yes/no): ");
            String choice = sc.next();
            if (!choice.equalsIgnoreCase("yes")) {
                continueRunning = false;
                Thread.sleep(3000);
                System.out.println("Thank you for running");
            }
        }

        sc.close();
    }
}
