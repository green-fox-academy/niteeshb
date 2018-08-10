package com.greenfoxacademy;


import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {

  public static void mainDraw(Graphics graphics) {
    int x=WIDTH/2 ;
    int y=HEIGHT/20;

    for (int i=0;i<=HEIGHT;){
      graphics.drawLine(i,HEIGHT,x,y) ;
      i=i+HEIGHT/20;
      x=x+i;
      y=y+i;
    }



//    for (int i=0; i<15;i++) {
//
//
//
//      graphics.drawLine(x,0,WIDTH,y) ;
//      graphics.drawLine(WIDTH-x,HEIGHT,0,HEIGHT-y);
//      x=x+WIDTH/15;
//      y=y+HEIGHT/15;
//      graphics.setColor(new Color(((int) (Math.random() * 255)), ((int) (Math.random() * 255)), ((int) (Math.random() * 255))));
//      //graphics.fillRect(row, col, size, size);

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