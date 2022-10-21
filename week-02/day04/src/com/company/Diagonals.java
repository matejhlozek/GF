package com.company;

import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Diagonals {
    public static void drawImage(Graphics g) {
        // Create a function that takes 3 parameters and draws a single line
        // Parameters: the x and y coordinates of the line's starting point and the graphics
        // The function shall draw a line from that point to the center of the canvas
        // Draw at least 3 lines with that function using a loop

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter X: ");
        int startingX = scanner.nextInt();
        System.out.println("Enter Y: ");
        int startingY = scanner.nextInt();
        if (startingX == 0 && startingY == 0){
            drawGreenLine(startingX, startingY, g);
        } else drawLine(startingX, startingY, g);
    }

    public static void drawGreenLine(int x, int y, Graphics g) {
        g.setColor(Color.GREEN);
        g.drawLine(x, y, 320 + (320 - x), 320 + (320 - y));
    }

    public static void drawLine(int x, int y, Graphics g) {
        g.drawLine(x, y, 320 + (320 - x), 320 + (320 - y));
    }


    // Don't touch the code below
    static int WIDTH = 640;
    static int HEIGHT = 640;

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