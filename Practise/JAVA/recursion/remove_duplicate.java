package recursion;

import java.util.HashSet;
import java.util.Scanner;

public class remove_duplicate {
    public static void remove(String str, int in, StringBuilder newstr, HashSet<Character> seen) {
        if (in == str.length()) {
            System.out.println(newstr.toString());
            return;
        }
        char curchar = str.charAt(in);
        if (seen.contains(curchar)) {
            remove(str, in + 1, newstr, seen);
        } else {
            newstr.append(curchar);
            seen.add(curchar);
            remove(str, in + 1, newstr, seen);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the string: ");
            String str = sc.next();
            StringBuilder newstr = new StringBuilder();
            HashSet<Character> seen = new HashSet<>();
            remove(str, 0, newstr, seen);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
