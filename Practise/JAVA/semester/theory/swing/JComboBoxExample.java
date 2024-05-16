package semester.theory.swing;

import javax.swing.*;
import java.awt.event.*;

public class JComboBoxExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JComboBox Example");
        frame.setSize(300, 200);

        String[] options = {"Option 1", "Option 2", "Option 3"};
        JComboBox<String> comboBox = new JComboBox<>(options);
        comboBox.setBounds(100, 50, 100, 30);
        comboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedOption = (String) comboBox.getSelectedItem();
                JOptionPane.showMessageDialog(frame, "Selected Option: " + selectedOption);
            }
        });

        frame.add(comboBox);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
