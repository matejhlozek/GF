
package com.company;

import javax.swing.*;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void drawImage(Graphics g) {
        // Create a square drawing function that takes 3 parameters
        // (the square size, the fill color and the graphics)
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares (red, orange, yellow, green, blue, indigo, violet).

        List<Color> list=new ArrayList<Color>();
        list.add(Color.RED);
        list.add(Color.ORANGE);
        list.add(Color.YELLOW);
        list.add(Color.GREEN);
        list.add(Color.BLUE);
        list.add(Color.MAGENTA); //should be indigo
        list.add(Color.PINK); // should be violet
        int size = 400;
        for (int i = 0; i < 7; i++) {
            size -= 50;
            Color a = list.get(i);
            drawRect(size, a, g);
        }
    }

    public static void drawRect(int size, Color colors,Graphics g) {
        g.setColor(colors);
        g.fillRect(320 - (size/2), 320 - (size/2), size, size);
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