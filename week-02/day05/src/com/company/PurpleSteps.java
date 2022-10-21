
package com.company;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps {
    public static void drawImage(Graphics g) {


        int x = 10;
        int y = 10;
        for (int i = 0; i < 20; i++) {
            drawRect(x, y, g);
            x += 10;
            y += 10;
        }
    }

    public static void drawRect(int x, int y, Graphics g) {
        g.setColor(new Color(180,40,250));
        g.fillRect(x, y, 10, 10);
        g.setColor(Color.BLACK);
        g.drawRect(x,y,10,10);
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