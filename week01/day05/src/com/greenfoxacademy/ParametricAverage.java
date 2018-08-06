package com.greenfoxacademy;

import java.util.Scanner;

public class ParametricAverage {
  public static void main(String[] args) {
    // Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4

    Scanner userinput=new Scanner(System.in);
    System.out.println("how many numbers you want to enter to find the Sum and Average ");
    int numb=userinput.nextInt();
    double sum=0;
    double inputNumber=0;
    System.out.println("Enter the numbers");
    for (int i = 1; i <= numb; i++) {


      inputNumber=userinput.nextDouble();
      sum=sum+inputNumber;

    }
    System.out.println("the Sum of different numbers is" + sum);
    System.out.println("the averager of different numbers is  "+ sum/numb);
  }
}
