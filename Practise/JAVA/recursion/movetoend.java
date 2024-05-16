package recursion;

import java.util.Scanner;

public class movetoend {
    public static void moving(String str, int idx, char moveChar, int count, String newstr) {
        if (idx == str.length()) {
            for (int i = 0; i < count; i++) {
                newstr += moveChar;
            }
            System.out.println("Modified String: " + newstr);
            System.out.println("Count of '" + moveChar + "': " + count);
            return;
        }

        char curchar = str.charAt(idx);

        if (curchar == moveChar) {
            count++;
            moving(str, idx + 1, moveChar, count, newstr);
        } else {
            newstr += curchar;
            moving(str, idx + 1, moveChar, count, newstr);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.next();

        System.out.println("Which character you want to move to the end: ");
        char m = sc.next().charAt(0);

        moving(str, 0, m, 0, "");

    }
}
