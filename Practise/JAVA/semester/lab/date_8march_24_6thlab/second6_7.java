package semester.lab.date_8march_24_6thlab;

import java.util.Scanner;

public class second6_7 {
    public static void main(String[] args) {
        try {
            int[] arr = new int[4];
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the numbers:");
            for (int i = 0; i < 5; i++) {
                arr[i] = scanner.nextInt();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception in thread 'main' " + e);
        }
    }
}
