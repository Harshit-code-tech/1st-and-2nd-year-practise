package recursion;

import java.util.Scanner;

public class fibonacci {

        // A recursive function to calculate the nth Fibonacci term
        static int fib(int n) {
            // Base cases
            if (n <= 1) return n;
            if (n == 2) return 1;

            // Recursive calls
            return fib(n - 1) + fib(n - 2);
        }

        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            try {
                System.out.println("\nEnter number of times: ");
                int N = sc.nextInt();
                if (N < 0) throw new IllegalArgumentException("Number of times cannot be negative");

                for (int i = 0; i < N; i++) {
                    System.out.print(fib(i) + " "); // Print the ith Fibonacci term
                }

                System.out.println("\nEnter the number position: ");
                int m = sc.nextInt();
                if (m < 0) throw new IllegalArgumentException("Number position cannot be negative");
                System.out.println(fib(m));
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (StackOverflowError e) {
                System.out.println("Too large input. Please enter a smaller integer.");
            } catch (Throwable e) {
                System.out.println("An unexpected error occurred: " + e);
            } finally {
                sc.close(); // Close the Scanner object
            }

        }
    }


