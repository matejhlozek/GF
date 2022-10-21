package com.company;

import javax.swing.*;

import java.awt.*;
import java.util.Random;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {
    public static void drawImage(Graphics g) {
        // Draw a green 10x10 square to the canvas' center
        g.setColor(Color.GREEN);
        g.drawRect(155, 155, 10, 10 );
        g.setColor(Color.BLUE);
        g.drawRect(145, 145, 40, 25 );
        g.setColor(Color.RED);
        g.drawRect(135, 135, 60, 40 );
        g.setColor(Color.BLACK);
        g.drawRect(125, 125, 80, 55 );
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