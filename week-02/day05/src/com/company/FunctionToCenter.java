package com.company;

import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
    public static void drawImage(Graphics g) {
        // Create a function that takes 3 parameters and draws a single line
        // Parameters: the x and y coordinates of the line's starting point and the graphics
        // The function shall draw a line from that point to the center of the canvas
        // Fill the canvas with lines from the edges (every 20 px) to the center

        int x = 0;
        int y = 0;

         for (int i = 0; i < 17; i++) {
            drawLine(x, y, g);
            x += 20;
        }
        for (int i = 0; i < 16; i++) {
            x = 320;
            y += 20;
            drawLine(x, y, g);
        }x = 0;
        for (int i = 0; i < 16; i++) {
            y = 320;
            drawLine(x, y, g);
            x += 20;
        }
        y=0;
        x = 0;
        for (int i = 0; i < 16; i++) {
            y += 20;
            drawLine(x, y, g);
        }
    }

    public static void drawLine(int x, int y, Graphics g) {

        g.drawLine(x, y, 160, 160);
    }


    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            drawImage(graphics);
        }
    }
}