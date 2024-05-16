package semester.theory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class KthSmallestFactorFinder {

    public static List<Integer> getAllFactors(int n) {
        List<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors.add(i);
            }
        }
        return factors;
    }

    public static Integer kthSmallestFactor(int n, int k) {
        List<Integer> factors = getAllFactors(n);
        Collections.sort(factors);
        return (k <= factors.size()) ? factors.get(k - 1) : null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer (N): ");
        int inputN = sc.nextInt();
        System.out.print("Enter the value of K: ");
        int inputK = sc.nextInt();

        System.out.print("Do you want to see all factors? (1 for Yes, 0 for No): ");
        int showAllFactors = sc.nextInt();

        switch (showAllFactors) {
            case 1 -> {
                Integer outputKthFactor = kthSmallestFactor(inputN, inputK);
                if (outputKthFactor != null) {
                    System.out.println("The K-th smallest factor: " + outputKthFactor);
                } else {
                    System.out.println("Invalid value of K");
                }
                List<Integer> allFactors = getAllFactors(inputN);
                System.out.println("All factors of " + inputN + ": " + allFactors);

            }
            case 0 -> {
                Integer outputKthFactor = kthSmallestFactor(inputN, inputK);
                if (outputKthFactor != null) {
                    System.out.println("The K-th smallest factor: " + outputKthFactor);
                } else {
                    System.out.println("Invalid value of K");
                }
            }
            default -> System.out.println("Invalid choice");
        }

        sc.close();
    }
}
