package com.greenfoxacademy;

import java.util.Scanner;

public class Power {
  // Given base and n that are both 1 or more, compute recursively (no loops)
// the value of base to the n power, so powerN(3, 2) is 9 (3 squared).

  static int num;
 static int result=1;

    public static void main(String[] args) {
      // write your code here
      Scanner userinput=new Scanner(System.in);
      System.out.println("Enter the number of which u want to find the power");
      num=userinput.nextInt();
      System.out.println("enter the power n");
      int number=userinput.nextInt();
      System.out.println("The sum of numbers is : " + power(number));
    }

    private static int power(int number) {

      if(number==0){
        return result;
      } else
        result=result*num;
        return (power(number-1));
    }
  }