package com.greenfoxacademy;

import java.util.Scanner;

public class sum {
  public static void main(String[] args) {
    //  Create the usual class wrapper
//  and main method on your own.

// - Write a function called `sum` that sum all the numbers
//   until the given parameter and returns with an integer
    int sumFunct=sum();
    System.out.println("sum of numbers  "+ sumFunct);
  }
  public static int sum(){
    System.out.println("enter the total number of number that you want to add");
    Scanner userinput=new Scanner(System.in);
    int totlNum=userinput.nextInt();
    int sum=0;
    int userinpu;
    System.out.println("enter the numbers");
    for(int i=1; i<=totlNum; i++){
      userinpu=userinput.nextInt();
      sum=sum+userinpu;
    }
    return sum;
  }
}
