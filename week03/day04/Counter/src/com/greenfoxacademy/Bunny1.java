package com.greenfoxacademy;

import java.util.Scanner;

public class Bunny1 {
static int sum=0;
  public static void main(String[] args) {
    // write your code here
    Scanner userinput=new Scanner(System.in);
    System.out.println("Enter the number of Bunnies");
    int number=userinput.nextInt();
    System.out.println("The sum of ears is : " + counterEar(number));
  }

  private static int counterEar(int number) {

    if(number==0){
      return sum;

    } else
      sum+=2;
      return (counterEar(number-1));
  }
}