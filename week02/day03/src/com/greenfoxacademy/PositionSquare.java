package com.greenfoxacademy;

import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PositionSquare {

  public static void mainDraw(Graphics graphics) {
    // create a square drawing function that takes 2 parameters:
    // the x and y coordinates of the square's top left corner
    // and draws a 50x50 square from that point.
    // draw 3 squares with that function.
    // avoid code duplication.

    Scanner userinput = new Scanner(System.in);
    for (int i = 1; i <= 3; i++) {
      System.out.println("Enter the X cordinate for " + i + " Square");
      int xCordinate = userinput.nextInt();
      System.out.println("Enter the Y cordinate for " + i + " Square");
      int yCordinate = userinput.nextInt();

      drawSquareFuction(xCordinate, yCordinate, graphics);

    }
  }
  public static void drawSquareFuction(int x, int y, Graphics graphics) {
    graphics.setColor(Color.GREEN);
    graphics.drawRect(x, y, 50, 50);
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
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}