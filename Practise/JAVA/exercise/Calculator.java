package exercise;

import java.util.Scanner;

public class Calculator {
    private static final int MAX_INPUT = 100000;
    private static final int MAX_MULTIPLIER = 7000;

    // Addition operation
    public static double add(double a, double b) {
        return a + b;
    }

    // Subtraction operation
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Multiplication operation
    public static double multiply(double a, double b) throws MaxMultiplierReachedException {
        if (a > MAX_MULTIPLIER || b > MAX_MULTIPLIER) {
            throw new MaxMultiplierReachedException("Max Multiplier Reached - Cannot multiply numbers greater than 7000.");
        }
        return a * b;
    }

    // Division operation
    public static double divide(double a, double b) throws CannotDivideByZeroException {
        if (b == 0) {
            throw new CannotDivideByZeroException("Cannot divide by zero.");
        }
        return a / b;
    }

    // Main calculation method that handles all operations and custom exceptions
    public static double calculate(char operation, double a, double b)
            throws InvalidInputException, MaxInputException, CannotDivideByZeroException, MaxMultiplierReachedException {
        // Check if both inputs are valid numbers
        if (!isValidInput(a) || !isValidInput(b)) {
            throw new InvalidInputException("Invalid input - Both inputs must be numbers.");
        }

        // Check if the absolute values of inputs are within the allowed range
        if (Math.abs(a) > MAX_INPUT || Math.abs(b) > MAX_INPUT) {
            throw new MaxInputException("Max Input Exception - Both inputs must be less than or equal to 100000.");
        }

        // Perform the corresponding operation
        switch (operation) {
            case '+':
                return add(a, b);
            case '-':
                return subtract(a, b);
            case '*':
                return multiply(a, b);
            case '/':
                return divide(a, b);
            default:
                throw new InvalidInputException("Invalid input - Supported operations are '+', '-', '*', and '/'.");
        }
    }

    // Helper method to check if the number is valid (not infinite or NaN)
    private static boolean isValidInput(double num) {
        return !Double.isInfinite(num) && !Double.isNaN(num);
    }

    // Custom exceptions

    // Exception for invalid input
    static class InvalidInputException extends Exception {
        public InvalidInputException(String message) {
            super(message);
        }
    }

    // Exception for division by zero
    static class CannotDivideByZeroException extends Exception {
        public CannotDivideByZeroException(String message) {
            super(message);
        }
    }

    // Exception for input exceeding the maximum limit
    static class MaxInputException extends Exception {
        public MaxInputException(String message) {
            super(message);
        }
    }

    // Exception for multiplication with a number greater than 7000
    static class MaxMultiplierReachedException extends Exception {
        public MaxMultiplierReachedException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();

        System.out.println("Enter the operation (+, -, *, /):");
        char operation = scanner.next().charAt(0);

        try {
            double result = calculate(operation, num1, num2);
            System.out.println("Result: " + result);
        } catch (InvalidInputException e) {
            // This exception occurs when either num1 or num2 is not a valid number (e.g., NaN or infinity).
            System.out.println("Invalid Input: " + e.getMessage());
        } catch (CannotDivideByZeroException e) {
            // This exception occurs when the operation is division (/) and num2 is 0.
            System.out.println("Cannot Divide By Zero: " + e.getMessage());
        } catch (MaxInputException e) {
            // This exception occurs when either num1 or num2 exceeds the allowed range (100000).
            System.out.println("Max Input Exception: " + e.getMessage());
        } catch (MaxMultiplierReachedException e) {
            // This exception occurs when the operation is multiplication (*) and either num1 or num2 is greater than 7000.
            System.out.println("Max Multiplier Reached: " + e.getMessage());
        }
    }
}