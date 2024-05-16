package semester.theory.swing;

import javax.swing.*;
import java.awt.event.*;

public class JCheckBoxExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JCheckBox Example");
        frame.setSize(300, 200);

        JCheckBox checkBox = new JCheckBox("Check Me");
        checkBox.setBounds(100, 50, 100, 30);
        checkBox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (checkBox.isSelected()) {
                    JOptionPane.showMessageDialog(frame, "Checkbox Selected!");
                }
            }
        });

        frame.add(checkBox);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
