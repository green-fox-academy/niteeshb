package com.greenfoxacademy;
import javafx.scene.paint.Color;

import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
  public static void mainDraw(Graphics graphics) {
    // Create a square drawing function that takes 2 parameters:
    // The square size, and the fill color,
    // and draws a square of that size and color to the center of the canvas.
    // Create a loop that fills the canvas with rainbow colored squares.
    Scanner userinput = new Scanner(System.in);
    for (int i = 1; i <= 4; i++) {
      System.out.println("Enter the Square size for " + i + " Square");
      int size = userinput.nextInt();
      String text = "red";
//      Color color;
//      Field field = Class.forName("java.awt.Color").getField(text.toLowerCase());
//      drawSquareFuction(size, graphics,col);

    }
  }

//  public static void drawSquareFuction(int size, Graphics graphics, String col) {
//    graphics.setColor(Color:col)
//    graphics.fillRect(WIDTH / 2 - size / 2, HEIGHT / 2 - size / 2, size, size);
//  }




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