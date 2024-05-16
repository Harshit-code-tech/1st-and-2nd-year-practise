package semester.lab.date18jan24;

import java.util.Scanner;

public class first1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();


        int lnum = lar(num1, num2, num3);


        System.out.println("The largest number is: " + lnum);


        sc.close();
    }

    public static int lar(int num1, int num2, int num3) {
        int max = num1;

        if (num2 > max) {
            max = num2;
        }

        if (num3 > max) {
            max = num3;
        }

        return max;
    }
}
