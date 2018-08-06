package com.greenfoxacademy;

import java.util.Scanner;

public class PrintBigger {
  public static void main(String[] args) {
    // Write a program that asks for two numbers and prints the bigger one

    Scanner userinput= new Scanner(System.in);
    System.out.println("Enter 2 numbers");
    int a1=userinput.nextInt();
    int a2=userinput.nextInt();
    if (a1>a2){
      System.out.println(a1+"  is bigger than  "+ a2);
    } else if(a2>a1){
      System.out.println(a2+"  is bigger than  "+ a1);
    } else{
      System.out.println("Both are equal");
    }
  }
}
