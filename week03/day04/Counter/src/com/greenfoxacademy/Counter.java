package com.greenfoxacademy;

import java.util.Scanner;

public class Counter {

  public static void main(String[] args) {
    // write your code here
    Scanner userinput = new Scanner(System.in);
    System.out.println("Enter the number for counter");
    int number = userinput.nextInt();
    counter(number);
  }

  private static int counter(int number) {

    if (number == 0) {
      System.out.println(number);
      return 0;
    } else
      System.out.println(number);
    return counter(number - 1);
  }
}
