package com.greenfoxacademy;


// Given a non-negative int n, return the sum of its digits recursively (no loops).
// Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
// divide (/) by 10 removes the rightmost digit (126 / 10 is 12)

import java.util.Scanner;

public class SumDigit {
static  int result=0;
  public static void main(String[] args) {
    // write your code here
    Scanner userinput=new Scanner(System.in);
    System.out.println("Enter the number of which u want to find the sum of digits");
    int number=userinput.nextInt();
    System.out.println("The sum of Digits is : " + sumOfDigits(number));
  }

  private static int sumOfDigits(int number) {

    if(number==0){
      return result;
    } else
      result=result+number%10;
    number=number/10;
      return (sumOfDigits(number));
  }
}