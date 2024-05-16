package semester.lab.date18jan24;

import java.util.Scanner;

public class extra1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();


        System.out.println("Enter the array elements:");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element #" + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

        System.out.print("Enter the number of positions to right shift (k): ");
        int k = sc.nextInt();


        srs(array, k);


        System.out.println("Array after right shift:");
        for (int num : array) {
            System.out.print(num + " ");
        }


        sc.close();
    }


    private static void srs(int[] arr, int k) {
        int n = arr.length;
        k = k % n;


        int[] temp = new int[n];


        if (k >= 0) System.arraycopy(arr, n - k, temp, 0, k);

        if (n - k >= 0) System.arraycopy(arr, 0, temp, k, n - k);

        System.arraycopy(temp, 0, arr, 0, n);
    }
}
