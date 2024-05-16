package exercise;

import java.util.Scanner;

public class NumberOccurrence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        int choice = 0;
        while (choice != 3) {
            System.out.println("Choose an option:");
            System.out.println("1) Display the position and count of a number");
            System.out.println("2) Change the target value");
            System.out.println("3) Exit");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the number to find its occurrence: ");
                    int target = input.nextInt();
                    int count = 0;
                    System.out.print("Positions: ");
                    for (int i = 0; i < size; i++) {
                        if (arr[i] == target) {
                            System.out.print(i + " ");
                            count++;
                        }
                    }
                    System.out.println("\nThe number " + target + " occurs " + count + " times in the array.");
                    break;
                case 2:

                    System.out.print("Enter the new target value: ");
                    target = input.nextInt();
                    break;
                case 3:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        }
    }
}
