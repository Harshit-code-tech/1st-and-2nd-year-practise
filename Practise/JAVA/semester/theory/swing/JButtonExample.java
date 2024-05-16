package semester.theory.swing;

import javax.swing.*;
import java.awt.event.*;

public class JButtonExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JButton Example");
        frame.setSize(300, 200);

        JButton button = new JButton("Click Me");
        button.setBounds(100, 50, 100, 30);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Button Clicked!");
            }
        });

        frame.add(button);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
