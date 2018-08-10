package com.greenfoxacademy;

import java.util.Scanner;

public class ArmstrongNumber {
  public static void main(String[] args) {
    Scanner userinput = new Scanner(System.in);
    System.out.println("Enter a number to find If its a Armstrong number or not");
    String numString = userinput.nextLine();
    int number = Integer.parseInt(numString);
    int total = 0;
    int temp = number;
    for (int i = 0; i < numString.length(); i++) {
      total += Math.pow((double) (temp % 10), (double) numString.length());
      temp = temp / 10;
    }
    if (total == number) {
      System.out.println("Awesome....U found the Armstrong number :" + number);
    } else {
      System.out.println(number + " is not a Armstrong number ");
    }
  }
}
