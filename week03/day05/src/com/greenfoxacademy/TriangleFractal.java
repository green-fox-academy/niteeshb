
package com.greenfoxacademy;
import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

  public class TriangleFractal {
    public static void mainDraw(Graphics graphics){

      int xpoints[] = {0, WIDTH, WIDTH/2};
      int ypoints[] = {0, 0, WIDTH};
      int npoints = 3;

      drawFractal(xpoints, ypoints, npoints);

    }

    public static void drawCircle(int x, int y, int size, Graphics graphics) {
      Random random = new Random();
//    graphics.setColor(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));

      graphics.drawRect(x, y, size, size);
    }

    public static void drawFractal(int x, int y, int size, Graphics graphics) {
      drawCircle(x, y, size, graphics);
      if (size > 5) {
        drawFractal(x + size / 3, y, size / 3, graphics);
        drawFractal(x, y + size / 3, size /3, graphics);
        drawFractal(x+ (size) / 3, y + 2*size / 3, size / 3, graphics);

      }


    }

    // Don't touch the code below
    static int WIDTH = 620;
    static int HEIGHT = 643;

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
        setBackground(Color.YELLOW);
        mainDraw(graphics);
      }
    }
  }