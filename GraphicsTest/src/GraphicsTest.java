package com.company;

import java.awt.*;
import java.awt.event.*;

public class GraphicsTest extends Frame {

    public static void main(String[] args) {

        Frame myFrame = new Frame();
        myFrame.setSize(400, 300);
        myFrame.setTitle("Graphics Testing");
        myFrame.setVisible(true);

        myFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

}
