package semester.lab.date_8march_24_6thlab;

import java.util.Scanner;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class fourth6_7 {
    public static void ProcessInput(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("Number should be positive");
        } else {
            System.out.println("Double value: " + (number * 2));
        }
    }

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number:");
            int num = scanner.nextInt();
            ProcessInput(num);
        } catch (NegativeNumberException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + e);
        }
    }
}
