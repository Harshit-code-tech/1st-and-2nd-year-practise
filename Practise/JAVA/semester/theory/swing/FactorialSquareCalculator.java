package semester.theory.swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FactorialSquareCalculator extends JFrame implements ActionListener {

    private JTextField numberField;
    private JButton factorialButton;
    private JButton squareButton;
    private JTextField resultField;

    public FactorialSquareCalculator() {
        super("Factorial and Square Calculator");

        // Create text field for number input
        numberField = new JTextField(10);
        numberField.addActionListener(this);

        // Create buttons for factorial and square operations
        factorialButton = new JButton("Factorial");
        factorialButton.addActionListener(this);
        squareButton = new JButton("Square");
        squareButton.addActionListener(this);

        // Create text field to display result
        resultField = new JTextField(10);
        resultField.setEditable(false); // Make result field read-only

        // Arrange components in a grid layout
        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.add(new JLabel("Enter a number:"));
        panel.add(numberField);
        panel.add(factorialButton);
        panel.add(squareButton);
        panel.add(new JLabel("Result:"));
        panel.add(resultField);

        // Add panel to the frame and set frame properties
        add(panel);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        String numberText = numberField.getText();
        double number;

        try {
            number = Double.parseDouble(numberText);

            if (event.getSource() == factorialButton) {
                resultField.setText(String.valueOf(calculateFactorial(number)));
            } else if (event.getSource() == squareButton) {
                resultField.setText(String.valueOf(number * number));
            }
        } catch (NumberFormatException e) {
            resultField.setText("Invalid input. Please enter a number.");
        }
    }

    public static long calculateFactorial(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }

        long result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        new FactorialSquareCalculator();
    }
}
