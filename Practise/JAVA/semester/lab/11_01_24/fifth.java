package semester.lab;

import java.util.Scanner;

public class fifth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for first name
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        // Get user input for last name
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        // Close the Scanner to avoid resource leak
        scanner.close();

        // Concatenate and print the full name
        String fullName = lastName + " " + firstName;
        System.out.println("Full Name: " + fullName);
    }
}
