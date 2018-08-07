package com.greenfoxacademy;

import java.util.Scanner;

public class DrawSquareInSquare {
  public static void main(String[] args) {
    // Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%
// %   %
// %   %
// %   %
// %   %
// %%%%%
//
// The square should have as many lines as the number was

    Scanner userinput=new Scanner(System.in);
    System.out.println("enter a number ");
    int squa=userinput.nextInt();
    for (int i = 1; i <= squa; i++) {
      if (i==1 || i==squa|| i==2|| i==squa-1){
        for (int j = 1; j<=squa ; j++) {
          System.out.print("% ");

        }
      } else {
        for (int k=1; k<=squa;k++){
          if (k==1 || k==squa|| k==2|| k==squa-1){
            System.out.print("% ");
          } else {
            System.out.print("  ");
          }
        }
      }
      System.out.println();
    }

  }
}
