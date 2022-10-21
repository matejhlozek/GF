
package com.company;

import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
    public static void drawImage(Graphics g) {
        // Draw the night sky:
        //  - The background should be black
        //  - The stars can be small squares
        //  - The stars should have random positions on the canvas
        //  - The stars should have random color (some shade of grey)
        Random random = new Random();
        int x = (int) random.nextInt(321);
        int y = (int) random.nextInt(321);
       int grayColor = (int) (Math.random() * 256);
        Color gray = new Color(grayColor, grayColor, grayColor);

        int size = 2;

        for (int j = 0; j < 5000; j++) {
            drawRect(size, x, y, gray, g);
            x = random.nextInt(641);
            y = random.nextInt(641);
            grayColor = (int) (Math.random() * 256);
            gray = new Color(grayColor, grayColor, grayColor);

        }
    }

    public static void drawRect(int size, int x, int y, Color gray, Graphics g) {
        g.setColor(gray);
        g.fillRect(x, y, size, size);
    }



    // Don't touch the code below
    static int WIDTH = 640;
    static int HEIGHT = 640;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.getContentPane().setBackground(Color.BLACK);
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
        panel.setBackground(Color.BLACK);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            drawImage(graphics);
        }
    }
}