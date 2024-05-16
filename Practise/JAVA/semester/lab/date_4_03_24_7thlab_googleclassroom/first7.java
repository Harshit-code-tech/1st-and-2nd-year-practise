package semester.lab.date_4_03_24_7thlab_googleclassroom;

import java.util.Scanner;

public class first7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Task 1: Convert a character array into a string using String constructor
        System.out.println("Enter a character array:");
        char[] arr = sc.nextLine().toCharArray();
        String strFromArray = new String(arr);
        System.out.println("Converted string: " + strFromArray);

        // Task 2: Change string from uppercase to lowercase
        System.out.println("Enter a string to convert to lowercase:");
        String input = sc.nextLine();
        String lowerCaseString = input.toLowerCase();
        System.out.println("Lowercase string: " + lowerCaseString);

        // Task 3: Convert an array of ASCII into a string using String constructor
        System.out.println("Enter ASCII array:");
        int[] asciiArray = sc.tokens().mapToInt(Integer::parseInt).toArray();
        String strFromASCII = new String(asciiArray, 0, asciiArray.length);
        System.out.println("String from ASCII: " + strFromASCII);

        // Task 4: Reverse a string
        System.out.println("Enter a string to reverse:");
        input = sc.nextLine();
        String reversedString = new StringBuilder(input).reverse().toString();
        System.out.println("Reversed string: " + reversedString);

        // Task 5: Use getChars() to convert a substring to an array of ASCII values
        System.out.println("Enter a string:");
        input = sc.nextLine();
        System.out.println("Enter start and end index for substring:");
        int start = sc.nextInt(), end = sc.nextInt();
        char[] subCharArray = new char[end - start];
        input.getChars(start, end, subCharArray, 0);
        System.out.println("ASCII values of substring:");
        for (char c : subCharArray) {
            System.out.print((int) c + " ");
        }
        System.out.println();

        // Task 6: Use substring() to print substring in the range given input by the user
        System.out.println("Enter a string:");
        input = sc.next();
        System.out.println("Enter start and end index for substring:");
        start = sc.nextInt(); end = sc.nextInt();
        String subString = input.substring(start, end);
        System.out.println("Substring: " + subString);

        // Task 7: Use compareTo() to compare 2 strings lexicographically
        System.out.println("Enter two strings to compare:");
        String str1 = sc.next(), str2 = sc.next();
        int comparison = str1.compareTo(str2);
        System.out.println("Comparison result: " + comparison);

        // Task 8: User lastIndexOf() to search the last input of a substring in a string
        System.out.println("Enter a string:");
        input = sc.next();
        System.out.println("Enter a substring to search:");
        String substring = sc.next();
        int lastIndex = input.lastIndexOf(substring);
        System.out.println("Last index of substring: " + lastIndex);

        // Task 9: Use replace() to replace all occurrences of one character in the invoking string with another character
        System.out.println("Enter a string:");
        input = sc.next();
        System.out.println("Enter character to replace:");
        char oldChar = sc.next().charAt(0);
        System.out.println("Enter replacement character:");
        char newChar = sc.next().charAt(0);
        String replacedString = input.replace(oldChar, newChar);
        System.out.println("Replaced string: " + replacedString);

        // Task 10: Use equals() to check if two strings are equal or not
        System.out.println("Enter two strings to compare:");
        String str3 = sc.next(), str4 = sc.next();
        boolean isEqual = str3.equals(str4);
        System.out.println("Strings are equal: " + isEqual);

        // Task 11: Use regionMatches() to compare substrings of the input string
        System.out.println("Enter a string:");
        input = sc.next();
        System.out.println("Enter a substring to compare:");
        String subStr = sc.next();
        System.out.println("Enter the start index to compare:");
        start = sc.nextInt();
        boolean isMatch = input.regionMatches(start, subStr, 0, subStr.length());
        System.out.println("Substrings match: " + isMatch);

        sc.close();
    }
}
