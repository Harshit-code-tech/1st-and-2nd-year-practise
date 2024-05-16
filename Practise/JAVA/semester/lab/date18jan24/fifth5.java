package semester.lab.date18jan24;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class fifth5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the list of numbers: ");
        String input = sc.nextLine();
        String[] numbersAsString = input.split("\\s+");

        int[] numbers = new int[numbersAsString.length];
        for (int i = 0; i < numbersAsString.length; i++) {
            try {
                numbers[i] = Integer.parseInt(numbersAsString[i]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter valid numbers.");
                return;
            }
        }

        Map<Integer, Integer> occurrences = new HashMap<>();
        for (int number : numbers) {
            occurrences.put(number, occurrences.getOrDefault(number, 0) + 1);
        }

        System.out.println("Number\tOccurrences");
        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            System.out.println(entry.getKey() + "\t\t" + entry.getValue());
        }

        sc.close();
    }
}
