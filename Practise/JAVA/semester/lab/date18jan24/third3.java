package semester.lab.date18jan24;

import java.util.Arrays;
import java.util.Scanner;

public class third3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the number of elements: ");
        int size = sc.nextInt();


        System.out.println("Enter the list of " + size + " numbers:");

        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter number #" + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }


        Arrays.sort(numbers);


        System.out.println("Sorted numbers:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }


        sc.close();
    }
}
