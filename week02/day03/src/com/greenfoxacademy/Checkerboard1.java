package com.greenfoxacademy;


import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard1 {

  public static void mainDraw(Graphics graphics) {

    int x = 0;
    int size = 20;
    for (int col = 0; col <= 3*HEIGHT; col += size) {

      for (int row = 0; row <= 3*WIDTH; row += size)

        if ((((col / size) % 2 == 0) && (row / size
        ) % 2 != 0) || ((((col / size) % 2 != 0) && (row / size) % 2 == 0))) {

          graphics.setColor(new Color(((int)(Math.random()*255)),((int)(Math.random()*255)),((int)(Math.random()*255))));
          graphics.fillRect(row, col, size, size);
          x *= 2;
        }
    }
  }


  //    Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 343;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}