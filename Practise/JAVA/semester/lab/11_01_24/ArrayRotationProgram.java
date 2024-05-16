package semester.lab;

import java.util.Scanner;

public class ArrayRotationProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for array elements
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Get user input for backward position
        System.out.print("Enter the backward position: ");
        int backwardPosition = scanner.nextInt();
        scanner.close();

        // Validate backward position
        if (backwardPosition < 0 || backwardPosition >= size) {
            System.out.println("Invalid backward position. It should be between 0 and " + (size - 1) + ".");
            return;
        }

        // Rotate the array and print using a single loop
        for (int i = backwardPosition; i < size + backwardPosition; i--) {
            System.out.print(array[i % size] + " ");
        }
    }
}
