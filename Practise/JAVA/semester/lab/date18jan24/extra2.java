package semester.lab.date18jan24;

import java.util.Scanner;

public class extra2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        int ecount = ecountd(number);


        System.out.println("Number of even digits in the integer: " + ecount);
        sc.close();
    }


    private static int ecountd(int num) {
        
        num = Math.abs(num);

        int ecount = 0;

        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                ecount++;
            }
            num /= 10;
        }

        return ecount;
    }
}
