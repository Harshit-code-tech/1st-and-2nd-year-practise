package semester.lab.date_8march_24_6thlab;

import java.util.Scanner;

public class third6_7 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter dividend:");
            int dividend = scanner.nextInt();
            System.out.println("Enter divisor:");
            int divisor = scanner.nextInt();
            int result = dividend / divisor;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught by try-catch-finally block");
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
