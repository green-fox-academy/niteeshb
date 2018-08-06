package com.greenfoxacademy;

import java.util.Scanner;

public class DrawDiagonal {
  public static void main(String[] args) {


    // Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%
// %%  %
// % % %
// %  %%
// %%%%%
//
// The square should have as many lines as the number was

    Scanner userinput=new Scanner(System.in);
    System.out.println("enter a number ");
    int squa=userinput.nextInt();
    for (int row = 1; row <= squa; row++) {
      if (row==1 || row==squa){
        for (int col = 1; col<=squa ; col++) {
          System.out.print("%");

        }
      } else {
        for (int col=1; col<=squa;col++){
          if (col==1 || col==squa || col==squa-row || k==row){
            System.out.print("%");
          } else {
            System.out.print(" ");
          }
        }
      }
      System.out.println();
    }

  }
}
