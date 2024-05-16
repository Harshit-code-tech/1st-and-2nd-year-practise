package semester.theory.swing;

import javax.swing.*;
import java.awt.event.*;

public class JRadioButtonExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JRadioButton Example");
        frame.setSize(300, 200);

        JRadioButton radioButton1 = new JRadioButton("Option 1");
        radioButton1.setBounds(100, 50, 100, 30);
        JRadioButton radioButton2 = new JRadioButton("Option 2");
        radioButton2.setBounds(100, 80, 100, 30);

        ButtonGroup group = new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);

        ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Selected: " + ((JRadioButton)e.getSource()).getText());
            }
        };

        radioButton1.addActionListener(listener);
        radioButton2.addActionListener(listener);

        frame.add(radioButton1);
        frame.add(radioButton2);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
