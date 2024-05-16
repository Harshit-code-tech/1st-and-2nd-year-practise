package semester.theory.swing;

import javax.swing.*;
import java.awt.*;

public class SwingPractice extends JFrame {
    private final JLabel label1;
    private final JLabel label2;
    private final JLabel label3;

    public SwingPractice() {
        super("Swing Practice");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        // Creating label1
        label1 = new JLabel("Label 1");
        label1.setToolTipText("Hovering over label1");
        c.add(label1);

        // Creating label2 with an ImageIcon (replace 'path_to_your_image' with the actual path to your image)
        ImageIcon bugIcon = new ImageIcon("/home/harshit/Downloads/images.jpg");
        label2 = new JLabel("Label 2", bugIcon, SwingConstants.CENTER);
        label2.setToolTipText("Hovering over label2");
        c.add(label2);

        // Creating label3 with an icon and text at bottom
        label3 = new JLabel("Label with icon and text at bottom", bugIcon, SwingConstants.CENTER);
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        label3.setToolTipText("Hovering over label3");
        c.add(label3);

        setSize(275, 170);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingPractice application = new SwingPractice();
    }
}
