package com.greenfoxacademy;


import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CheckerBoard2 {

  public static void mainDraw(Graphics graphics) {


    int size = 5;
    int x=0;
    for (int col = 0; col <= 3*HEIGHT; col += size) {
      int y = 0;
      for (int row = 0; row <= 3 * WIDTH; row += size){

        if ((x+y)%2!=0) {

          graphics.setColor(new Color(((int) (Math.random() * 255)), ((int) (Math.random() * 255)), ((int) (Math.random() * 255))));
          graphics.fillRect(row, col, size, size);

        } else{
          graphics.setColor(Color.RED);
          graphics.fillRect(row, col, size, size);
        }
        y+=1;
      }
      x+=1;
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