package com.greenfoxacademy;

import java.util.Scanner;

public class OddEven {
  public static void main(String[] args) {
    Scanner userinput=new Scanner(System.in);
    System.out.println("enter a number");
    int number=userinput.nextInt();
    if (number%2>0){
      System.out.println(number+ " :  number is odd");
    }else {
      System.out.println(number+ " : number is even");
    }
  }
  // Write a program that reads a number from the standard input,
// Then prints "Odd" if the number is odd, or "Even" if it is even.
}
