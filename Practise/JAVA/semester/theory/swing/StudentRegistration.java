package semester.theory.swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StudentRegistration extends JFrame implements ActionListener {

    private JLabel rollNoLabel;
    private JTextField rollNoField;
    private JLabel nameLabel;
    private JTextField nameField;
    private JLabel marksLabel;
    private JTextField marksField;
    private JButton insertButton;

    // In-memory student data storage (replace with database interaction for persistence)
    private static final StudentRecord[] students = new StudentRecord[100];
    private static int studentCount = 0;

    public StudentRegistration() {
        super("Student Registration");

        // Create labels and text fields
        rollNoLabel = new JLabel("Roll No:");
        rollNoField = new JTextField(10);
        nameLabel = new JLabel("Name:");
        nameField = new JTextField(20);
        marksLabel = new JLabel("Marks:");
        marksField = new JTextField(10);

        // Create button
        insertButton = new JButton("Insert");
        insertButton.addActionListener(this);

        // Arrange components in a grid layout
        JPanel panel = new JPanel(new GridLayout(4, 2));
        panel.add(rollNoLabel);
        panel.add(rollNoField);
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(marksLabel);
        panel.add(marksField);
        panel.add(new JLabel("")); // Empty label for spacing
        panel.add(insertButton);

        // Add panel to the frame and set frame properties
        add(panel);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == insertButton) {
            String rollNo = rollNoField.getText();
            String name = nameField.getText();
            String marksText = marksField.getText();

            // Basic input validation (check for empty fields or invalid marks format)
            if (rollNo.isEmpty() || name.isEmpty() || !marksText.matches("\\d+")) {
                JOptionPane.showMessageDialog(this, "Please enter valid data for all fields!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            int marks = Integer.parseInt(marksText);

            // Add student record to in-memory storage (replace with database insert)
            if (studentCount < students.length) {
                students[studentCount] = new StudentRecord(rollNo, name, marks);
                studentCount++;
                JOptionPane.showMessageDialog(this, "Student record inserted successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);

                // Clear input fields for next entry
                rollNoField.setText("");
                nameField.setText("");
                marksField.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Student data storage is full!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        new StudentRegistration();
    }
}

