package semester.lab.date18jan24;

public class second2 {
    public static void main(String[] args) {

        if (args.length != 10) {
            System.out.println("Please provide 10 numbers.");
            return;
        }

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < 10; i++) {
            try {
                int number = Integer.parseInt(args[i]);

                if (number % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please provide valid integers.");
                return;
            }
        }
        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of odd numbers: " + oddCount);
    }
}
