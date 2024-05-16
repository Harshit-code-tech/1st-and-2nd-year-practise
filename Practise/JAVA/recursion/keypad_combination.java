package recursion;

import java.util.Scanner;

public class keypad_combination {
    public static String key[]={".","1abc","2def","3ghi","4jkl","5mno","6pqrs","7tu","8vwx","9yz"};
    public static int count =0;

    public static void combination(String number, int in, String combi) {
        if (in == number.length()) {
            count++;
            System.out.println(count + ")" + combi);
            return;
        }

        for (int i = 0; i < key[number.charAt(in) - '0'].length(); i++) {
            char curr = key[number.charAt(in) - '0'].charAt(i);
            combination(number, in + 1, combi + curr);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers combination: ");
        String number = sc.next();
        long startTime = System.currentTimeMillis();
        combination(number,0,"");
        long endTime = System.currentTimeMillis();

        System.err.println("\nTime taken: " + (endTime - startTime) + " ms");
    }
}
