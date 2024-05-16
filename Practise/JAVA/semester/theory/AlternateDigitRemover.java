package semester.theory;

import java.util.Scanner;

public class AlternateDigitRemover {
    public static int removeAlternateDigits(int num) {
        int result = 0;
        int multiplier = 1;
        boolean alternate = false;
        while (num > 0) {
            int digit = num % 10;
            if (alternate) {
                result += digit * multiplier;
                multiplier *= 10;
            }
            alternate = !alternate;
            num /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int inputNum = sc.nextInt();
        int outputResult = removeAlternateDigits(inputNum);
        System.out.println("Result after removing alternate digits: " + outputResult);
        sc.close();
    }
}
