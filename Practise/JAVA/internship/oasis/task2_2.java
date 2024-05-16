package internship.oasis;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class task2_2 extends JFrame {
    private int randomNumber;
    private int attempts;
    private final int maxAttempts = 5;

    private JTextField guessField;
    private JButton guessButton;
    private JLabel resultLabel;
    private JLabel attemptsLabel;

    public task2_2() {
        setTitle("Guess the Number");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        // Generate a random number
        Random random = new Random();
        randomNumber = random.nextInt(100) + 1; // Number between 1 and 100

        guessField = new JTextField(10);
        guessButton = new JButton("Guess");
        resultLabel = new JLabel("Guess a number between 1 and 100");
        attemptsLabel = new JLabel("Attempts left: " + maxAttempts);

        add(guessField);
        add(guessButton);
        add(resultLabel);
        add(attemptsLabel);

        guessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkGuess();
            }
        });
    }

    private void checkGuess() {
        int guess;
        try {
            guess = Integer.parseInt(guessField.getText());
        } catch (NumberFormatException ex) {
            resultLabel.setText("Please enter a valid number.");
            return;
        }

        if (guess < 1 || guess > 100) {
            resultLabel.setText("Please enter a number between 1 and 100.");
            return;
        }

        attempts++;
        attemptsLabel.setText("Attempts left: " + (maxAttempts - attempts));

        if (guess == randomNumber) {
            resultLabel.setText("Congratulations! You guessed the number!");
            guessButton.setEnabled(false);
        } else if (attempts >= maxAttempts) {
            resultLabel.setText("Sorry, you've run out of attempts. The number was: " + randomNumber);
            guessButton.setEnabled(false);
        } else {
            if (guess < randomNumber) {
                resultLabel.setText("Try a higher number.");
            } else {
                resultLabel.setText("Try a lower number.");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new task2_2().setVisible(true);
            }
        });
    }
}
