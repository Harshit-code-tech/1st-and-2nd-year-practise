package semester.lab.date18jan24;

import java.util.Scanner;

public class sixth6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 3x3 matrix:");
        int[][] matrix = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter element at position [" + (i + 1) + "][" + (j + 1) + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }
        int lsum = 0;
        for (int i = 0; i < 3; i++) {
            lsum += matrix[i][i];
        }
        int rsum = 0;
        for (int i = 0; i < 3; i++) {
            rsum += matrix[i][2 - i];
        }
        System.out.println("Sum of the left diagonal: " + lsum);
        System.out.println("Sum of the right diagonal: " + rsum);
        sc.close();
    }
}
