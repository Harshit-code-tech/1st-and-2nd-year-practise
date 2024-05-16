package patterns;

public class advance_Pattern {
    public static void main(String[] args) {
        int i, j, k, n = 4, m;
        //butterfly pattern
        System.out.println("Butterfly pattern");
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }

            int space = 2 * (n - i);
            for (j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (i = n; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            int space = 2 * (n - i);
            for (j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("\n\n");

        }

        //hollow butterfly
        System.out.println("Hollow butterfly");
        // Upper half of the hollow butterfly pattern
        for (i = 1; i <= n; i++) {
            // Left half of the butterfly
            for ( j = 1; j <= 2 * n; j++) {
                if (j <= i || j > 2 * n - i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            // Right half of the butterfly
            for (j = 2 * n; j >= 1; j--) {
                if (j <= i || j > 2 * n - i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }

        // Lower half of the hollow butterfly pattern
        for ( i = n; i >= 1; i--) {
            // Left half of the butterfly
            for ( j = 1; j <= 2 * n; j++) {
                if (j <= i || j > 2 * n - i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            // Right half of the butterfly
            for ( j = 2 * n; j >= 1; j--) {
                if (j <= i || j > 2 * n - i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }


        //solid rhombus
        System.out.println("solid rhombus");
        n=5;
        for(i=1;i<=n;i++){
            //spaces
            for(j=1;j<=n-i;j++){
                System.out.print(" ");

            }
            //stars
            for(j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println( );
        }
        System.out.println("\n\n");



        //hollow rhombus
        System.out.println("hollow rhombus");
        for ( i = 1; i <= n; i++) {
            // Print spaces
            for ( j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print asterisks for the first and last row
            if (i == 1 || i == n) {
                for ( j = 1; j <= n; j++) {
                    System.out.print("*");
                }
            } else {
                // Print asterisks and spaces for the other rows
                System.out.print("*");
                for (j = 1; j <= n - 2; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            System.out.println();
        }
        System.out.println("\n\n");


        //numbers pyramid
        System.out.println("number pyramid");
        for(i=1;i<=n;i++){
            //spaces
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //numbers
            for(j=1;j<=i;j++){
                System.out.print(i+ " ");
            }
            System.out.println();
        }
        System.out.println("\n\n");



        //diamond
        System.out.println("DDiamond");
        // Upper half of the diamond pattern
        for (i = 1; i <= n; i++) {
            //spaces    
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half of the diamond pattern
        for (i = n - 1; i >= 1; i--) {
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\n\n");


        //palindrom pattern diamond
        System.out.println("Palindrom  pattern");
        // Upper half of the palindrome pattern
        for (i = 1; i <= n; i++) {
            int num = 1;
            // Print spaces before the numbers
            for (j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Print numbers in increasing order
            for (j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }

            // Print numbers in decreasing order
            num -= 2;
            for (j = 1; j <= i - 1; j++) {
                System.out.print(num + " ");
                num--;
            }

            System.out.println();
        }

        // Lower half of the palindrome pattern
        for (i = n - 1; i >= 1; i--) {
            int num = 1;
            // Print spaces before the numbers
            for (j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Print numbers in increasing order
            for (j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }

            // Print numbers in decreasing order
            num -= 2;
            for (j = 1; j <= i - 1; j++) {
                System.out.print(num + " ");
                num--;
            }

            System.out.println();
        }
        System.out.println("\n\n");



        //second type of palindrom
        System.out.println("second type of palindrom");
        for(i=1;i<=n;i++){
            //spaces
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //1st half number
            for(j=i;j>=1;j--){
                System.out.print(j);
            }
            //2nd half
            for(j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
