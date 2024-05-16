package semester.lab;

import java.util.Scanner;

public class fourth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int num = sc.nextInt();
        sc.close();

        int originalnum = num;
        int reversednum = 0;

        while (num != 0) {
            int digit = num % 10;
            reversednum = reversednum * 10 + digit;
            num /= 10;
        }

        if (originalnum == reversednum) {
            System.out.println(originalnum + " is a palindrome.");
        } else {
            System.out.println(originalnum + " is not a palindrome.");
        }
    }
}
