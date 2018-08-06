package com.greenfoxacademy;

import java.util.Scanner;

public class DrawPyramid {

  // Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was
  public static void main(String[] args) {
    Scanner userinput=new Scanner(System.in);
    int triangle=userinput.nextInt();
    int c;

    for (int b=1;b<=triangle;b++){


      for ( c=1; c<=triangle-b;c++){
        System.out.print(" ");

      }
      for (int d=1; d<=((2*b)-1); d++){
        System.out.print("*");
      }

      for ( c=1; c<=triangle-b;c++){
        System.out.print(" ");

      }
      System.out.println();
    }

  }
}
