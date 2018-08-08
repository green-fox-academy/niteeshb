package com.greenfoxacademy;

import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class HorizontalLines {
  public static void mainDraw(Graphics graphics) {
    // Create a line drawing function that takes 2 parameters:
    // The x and y coordinates of the line's starting point
    // and draws a 50 long horizontal line from that point.
    // Draw 3 lines with that function. Use loop for that.
    Scanner userinput = new Scanner(System.in);
    for (int i = 1; i <= 3; i++) {
      System.out.println("Enter the X cordinate for " + i + " Line");
      int xCordinate = userinput.nextInt();
      System.out.println("Enter the Y cordinate for " + i + " Line");
      int yCordinate = userinput.nextInt();

      drawLineFuction(xCordinate, yCordinate, graphics);

    }


  }

  public static void drawLineFuction(int x, int y, Graphics graphics) {
    {

      graphics.setColor(Color.GREEN);
      graphics.drawLine(x, y, x + 50, y);


    }

  }

  // Don't touch the code below
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