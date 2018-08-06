package com.greenfoxacademy;

import java.util.Scanner;

public class MileToKmConverter {
  public static void main(String[] args) {
    // Write a program that asks for an integer that is a distance in kilometers,
    // then it converts that value to miles and prints it

    System.out.println("enter distance in KM. plz give only integer");
    Scanner userinput= new Scanner(System.in);
    int km=userinput.nextInt();
    System.out.println(" Distance in Miles:  " + km/0.6712);
  }
}
