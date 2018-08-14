package com.greenfoxacademy;

import java.util.Scanner;

public class DivideBy0 {

  public static void main(String[] args) {
// Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0

    Scanner userinput = new Scanner(System.in);
    int num = userinput.nextInt();
    System.out.println(divideBy0(num));


  }

  private static String divideBy0(int num) {
    int cal;
    try {
      cal=( 10 / num);
    } catch (Exception ex) {
      return "fail";
    }
    return cal+"";
  }
}