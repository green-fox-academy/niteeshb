package com.greenfoxacademy;

import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args) {
    Scanner userinput=new Scanner(System.in);
    System.out.println("Enter the number for fibnacci series");
    int number=userinput.nextInt();
    System.out.println((fibonacchi(number)));
  }

  private static int fibonacchi(int number) {

    if (number<=0){
      return 0;
    }else if(number==1){
      return 1;
    }else{
//      System.out.print(number);
      return fibonacchi(number-1)+ fibonacchi(number-2);
    }
  }
}
