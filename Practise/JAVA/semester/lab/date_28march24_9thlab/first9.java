package semester.lab.date_28march24_9thlab;

import javax.swing.*;
import java.awt.*;
public class first9 {
    public static void main(String [] args){
        JFrame fr = new JFrame();
        JButton b = new JButton("click");
        b.setBounds(130,100,100,40);
        fr.add(b);
        fr.setSize(400,500);
        fr.setLayout(new FlowLayout());
        fr.setVisible(true);
    }

}

