package com.greenfoxacademy;

import java.util.Scanner;

public class DrawDiamond {
  // Write a program that reads a number from the standard input, then draws a
// diamond like this:
//
//
//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *
//
// The diamond should have as many lines as the number was

  public static void main(String[] args) {
  //Enter the number of Lines for the diamond
    Scanner userinput = new Scanner(System.in);
    System.out.println("  Enter the number of Lines for the diamond");
    int triangle = userinput.nextInt();
//this loop is for upper half of diamond
    for (int b = 1; b <= (triangle/2); b++) {

//through this loop, we check the number of spaces in each line before *
      for (int c = 1; c <= (triangle/2 - b)+1; c++) {
        System.out.print(" ");
      }
      //we printing * in each line
      for (int d = 1; d <= ((2 * b) - 1); d++) {
        System.out.print("*");
      }
      // Printing " " (blank spaces) after *
      for (int c = 1; c <= triangle - b; c++) {
        System.out.print(" ");
      }
      System.out.println();
    }
    if(triangle%2!=0){
      for (int o=1;o<=triangle;o++){
        System.out.print("*");
      }
      System.out.println();
    }

    //LOWER HALF of diamond


    for (int b = triangle/2; b >=1; b--) {

      //No. of spaces before printing *
      for (int c = 1; c <= (triangle/2 - b)+1; c++) {
        System.out.print(" ");

      }
      //Printing *
      for (int d = 1; d <= ((2 * b) - 1); d++) {
        System.out.print("*");
      }
      for (int c = 1; c <= triangle - b; c++) {
        System.out.print(" ");

      }
      System.out.println();
    }
  }
}
