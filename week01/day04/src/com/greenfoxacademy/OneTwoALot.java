package com.greenfoxacademy;

import java.util.Scanner;

public class OneTwoALot {
  public static void main(String[] args) {
    // Write a program that reads a number form the standard input,
// If the number is zero or smaller it should print: Not enough
// If the number is one it should print: One
// If the number is two it should print: Two
// If the number is more than two it should print: A lot

    Scanner userinput= new Scanner(System.in);
    int a=1;
    while(a==1) {


      System.out.println("Enter a number");
      int num = userinput.nextInt();
      if (num <= 0) {
        System.out.println("Not enough");
      } else if (num == 1) {
        System.out.println("one");
      } else if (num == 2) {
        System.out.println("two");
      } else if (num > 2) {
        System.out.println("A lot");
      }
      System.out.println("do u want to enter another number to check: if yes press 1");
      int b=userinput.nextInt();
      if (b!=1){
        a=2;
      }
    }
  }
}
