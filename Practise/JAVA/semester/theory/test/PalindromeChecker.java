package semester.theory.test;

import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter a string: ");
        String iStr = sc.nextLine();


        if (isp(iStr)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }

        sc.close();
    }


    public static boolean isp(String str) {

        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = str.length() - 1;


        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
