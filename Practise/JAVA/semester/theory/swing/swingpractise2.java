package semester.theory.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class swingpractise2 extends JFrame {
    private final JTextField textField1;
    private final JTextField textField2;
    private final JTextField textField3;
    private final JPasswordField passwordField;

    public swingpractise2() {
        super("Testing JTextField and JPasswordField");
        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        textField1 = new JTextField(10);
        textField2 = new JTextField("Enter text here");
        textField3 = new JTextField("Uneditable text field", 20);
        textField3.setEditable(false);
        passwordField = new JPasswordField("Hidden text");

        container.add(textField1);
        container.add(textField2);
        container.add(textField3);
        container.add(passwordField);

        TextFieldHandler handler = new TextFieldHandler();
        textField1.addActionListener(handler);
        textField2.addActionListener(handler);
        textField3.addActionListener(handler);
        passwordField.addActionListener(handler);

        setSize(325, 100);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        swingpractise2 application = new swingpractise2();
    }

    private class TextFieldHandler implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String string = "";

            if (event.getSource() == textField1)
                string = "textField1: " + event.getActionCommand();
            else if (event.getSource() == textField2)
                string = "textField2: " + event.getActionCommand();
            else if (event.getSource() == textField3)
                string = "textField3: " + event.getActionCommand();
            else if (event.getSource() == passwordField)
                string = "passwordField: " + new String(passwordField.getPassword());

            JOptionPane.showMessageDialog(null, string);
        }
    }
}
