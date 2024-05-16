package OOPS;
import java.util.Scanner;
import java.util.Random;

 class guess_the_number {
    private int targetNumber;

    public guess_the_number() {
        // Generate a random number between 1 and 100 (inclusive)
        Random random = new Random();
        targetNumber = random.nextInt(100) + 1;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        int guess;
        int attempts = 0;

        System.out.println("Welcome to the Simple Guess the Number game!");
        System.out.println("Try to guess the number between 1 and 100");

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess == targetNumber) {
                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
            } else if (guess < targetNumber) {
                System.out.println("Try again! The number is higher.");
            } else {
                System.out.println("Try again! The number is lower.");
            }
        } while (guess != targetNumber);

        scanner.close();
    }

    public static void main(String[] args) {
        guess_the_number game = new guess_the_number();
        game.play();
    }
}
