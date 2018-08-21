package com.greenfoxacademy;
import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Main {

  public static void mainDraw(String name, String result, Graphics graphics) {

    graphics.setColor(Color.CYAN);
    graphics.fillRect(50, 50, 200, 200);
    graphics.setColor(Color.BLACK);

    if (result.equals(name)) {
      graphics.drawString(name, 120, 120);
      graphics.drawString("is a part from the greet family", 75, 150);
    } else {
      graphics.drawString(name, 120, 120);
      graphics.drawString("is not a part from the greet family", 60, 150);
    }
  }


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
      Scanner scanner = new Scanner(System.in);
      System.out.println("please enter you name :");
      String name = scanner.nextLine();
      Family member = new Family();

      String result = member.Check_if_this_person_is_a_member(name);
      super.paintComponent(graphics);

      mainDraw(name, result, graphics);

    }
  }

}