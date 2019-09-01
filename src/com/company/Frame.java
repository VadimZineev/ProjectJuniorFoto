package com.company;

import javax.swing.*;
import java.awt.*;

public class Frame {
    JFrame frame = new JFrame("JF");
    JPanel panel = new JPanel();
    JButton buttons[] = new JButton[20];
    String childrenNames [] = new String[20];

        Frame(){
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setVisible(true);
            frame.setBounds(350, 10, 1250, 1000 );
            panel.setBounds(0, 0, 1250, 1000);
            panel.setVisible(true);
            panel.setLayout(null);

            for (int i = 0; i < buttons.length; i++) {
                int x = 0, y = 0;
                int w = 250, h = 250;
                buttons[i].setBounds(x, y, w, h);

            }
            frame.add(panel);
        }
}
