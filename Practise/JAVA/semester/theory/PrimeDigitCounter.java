package semester.theory;

import java.util.Scanner;

public class PrimeDigitCounter {
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int countPrimeDigits(int num) {
        int count = 0;
        while (num > 0) {
            int digit = num % 10;
            if (isPrime(digit)) {
                count++;
            }
            num /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int inputNum = sc.nextInt();
        int outputCount = countPrimeDigits(inputNum);
        System.out.println("Number of prime digits: " + outputCount);
        sc.close();
    }
}
