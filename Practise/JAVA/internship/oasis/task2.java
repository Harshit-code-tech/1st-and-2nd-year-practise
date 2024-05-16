package internship.oasis;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class task2 extends JFrame {
    private JTextField textField;
    private JButton submitButton;
    private JLabel feedbackLabel;

    private Random random;
    private int randomNumber;
    private int maxNumber = 100;
    private int maxAttempts = 5;
    private int attempts = 0;
    private int totalScore = 0;
    private int totalRounds = 3;
    private int currentRound = 1;

    public task2() {
        super("Guess the Number Game");
        random = new Random();
        randomNumber = generateRandomNumber();

        setLayout(new FlowLayout());

        textField = new JTextField(10);
        add(textField);

        submitButton = new JButton("Submit");
        add(submitButton);

        feedbackLabel = new JLabel("");
        add(feedbackLabel);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                processGuess();
            }
        });

        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private int generateRandomNumber() {
        return random.nextInt(maxNumber) + 1;
    }

    private void processGuess() {
        String input = textField.getText();
        try {
            int guess = Integer.parseInt(input);
            attempts++;

            if (guess == randomNumber) {
                feedbackLabel.setText("Congratulations! You guessed the number in " + attempts + " attempts.");
                totalScore += calculatePoints(attempts, maxAttempts);
                if (currentRound < totalRounds) {
                    currentRound++;
                    attempts = 0;
                    randomNumber = generateRandomNumber();
                    feedbackLabel.setText("Round " + currentRound + ": Guess a number between 1 and " + maxNumber);
                } else {
                    feedbackLabel.setText("Game Over! Total Score: " + totalScore);
                    submitButton.setEnabled(false);
                }
            } else if (guess < randomNumber) {
                feedbackLabel.setText("Your guess is too low. Try again!");
            } else {
                feedbackLabel.setText("Your guess is too high. Try again!");
            }
        } catch (NumberFormatException ex) {
            feedbackLabel.setText("Please enter a valid number.");
        }
        textField.setText("");
        if (attempts == maxAttempts && currentRound < totalRounds) {
            feedbackLabel.setText("You ran out of guesses. The number was: " + randomNumber);
            attempts = 0;
            currentRound++;
            randomNumber = generateRandomNumber();
            feedbackLabel.setText("Round " + currentRound + ": Guess a number between 1 and " + maxNumber);
        }
    }

    private int calculatePoints(int attempts, int maxAttempts) {
        return maxAttempts - attempts + 1;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new task2();
            }
        });
    }
}

