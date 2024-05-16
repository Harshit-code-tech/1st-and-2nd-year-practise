package semester.theory.swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PasswordValidatorGUI extends JFrame implements ActionListener {

    private JLabel passwordLabel;
    private JTextField passwordField;
    private JButton checkButton;
    private JLabel resultLabel;

    public PasswordValidatorGUI() {
        super("Password Validator");

        // Create labels and text field
        passwordLabel = new JLabel("Enter Password:");
        passwordField = new JTextField(20);
        resultLabel = new JLabel(""); // Initially empty for result

        // Create button
        checkButton = new JButton("Check Password");
        checkButton.addActionListener(this);

        // Arrange components in a grid layout
        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(new JLabel("")); // Empty label for spacing
        panel.add(checkButton);
        panel.add(new JLabel("")); // Empty label for spacing
        panel.add(resultLabel);

        // Add panel to the frame and set frame properties
        add(panel);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == checkButton) {
            String password = passwordField.getText();
            boolean isValid = PasswordValidator.isValidPassword(password);

            if (isValid) {
                resultLabel.setText("Password is valid!");
            } else {
                resultLabel.setText("Password is invalid!");
            }
        }
    }

    public static void main(String[] args) {
        new PasswordValidatorGUI();
    }
}

class PasswordValidator {

    public static boolean isValidPassword(String password) {
        if (password == null || password.isEmpty()) {
            return false; // Password cannot be null or empty
        }

        int minLength = 8; // Minimum password length
        int minLowerCaseLetters = 1; // Minimum lowercase letters
        int minUpperCaseLetters = 1; // Minimum uppercase letters
        int minDigits = 1; // Minimum digits
        int minSpecialCharacters = 1; // Minimum special characters

        int lowercaseCount = 0;
        int uppercaseCount = 0;
        int digitCount = 0;
        int specialCount = 0;

        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                lowercaseCount++;
            } else if (Character.isUpperCase(c)) {
                uppercaseCount++;
            } else if (Character.isDigit(c)) {
                digitCount++;
            } else if (!Character.isWhitespace(c)) { // Exclude whitespace
                specialCount++;
            }
        }

        return password.length() >= minLength &&
                lowercaseCount >= minLowerCaseLetters &&
                uppercaseCount >= minUpperCaseLetters &&
                digitCount >= minDigits &&
                specialCount >= minSpecialCharacters;
    }
}
