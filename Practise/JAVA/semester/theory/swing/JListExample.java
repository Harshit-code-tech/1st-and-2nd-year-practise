package semester.theory.swing;

import javax.swing.*;
import javax.swing.event.*;

public class JListExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JList Example");
        frame.setSize(300, 200);

        String[] data = {"Item 1", "Item 2", "Item 3"};
        JList<String> list = new JList<>(data);
        list.setBounds(100, 50, 100, 60);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    String selectedValue = list.getSelectedValue();
                    JOptionPane.showMessageDialog(frame, "Selected Item: " + selectedValue);
                }
            }
        });

        frame.add(list);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
