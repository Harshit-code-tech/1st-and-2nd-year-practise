package patterns;

import java.util.Scanner;

public class basic_patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4; // Default value for n
        int m = 5; // Default value for m
        int i, j, k, num = 1;

        // Solid rectangle
        System.out.println("Solid rectangle");
        System.out.println("Enter the number of rows");
        n = sc.nextInt();
        System.out.println("Enter the number of columns ");
        m = sc.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Hollow rectangle
        System.out.println("Hollow rectangle");
        System.out.println("Enter the number of rows");
        n = sc.nextInt();
        System.out.println("Enter the number of columns ");
        m = sc.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= m; j++) {
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

        // Left-side right-angle triangle
        System.out.println("Left-side right-angle triangle");
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Triangle with numbers
        System.out.println("Triangle with numbers");
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // Floyd's triangle
        System.out.println("Floyd's triangle");
        num = 1;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }

        // 0-1 triangle
        System.out.println("0-1 triangle");
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

        // Inverted left-side right-angle triangle
        System.out.println("Inverted left-side right-angle triangle");
        for (i = n; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Inverted triangle with numbers
        System.out.println("Inverted triangle with numbers");
        for (i = n; i >= 1; i--) {
            for (j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // Right-side right-angle triangle
        System.out.println("Right-side right-angle triangle");
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
