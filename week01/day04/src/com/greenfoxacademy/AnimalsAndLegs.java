package com.greenfoxacademy;

import java.util.Scanner;

public class AnimalsAndLegs {
  public static void main(String[] args) {
    // Write a program that asks for two integers
    // The first represents the number of chickens the farmer has
    // The second represents the number of pigs owned by the farmer
    // It should print how many legs all the animals have

    Scanner userinputs= new Scanner(System.in);
    System.out.println("Enter the number of Chickens");
    int chick=userinputs.nextInt();
    System.out.println("Enter the number of pigs");
    int pigs=userinputs.nextInt();
    System.out.println("total animals are: " +(chick+pigs));
    System.out.println("total legs these animals have:  " + ((chick*2)+(4*pigs)));
  }
}
