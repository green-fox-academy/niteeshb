package com.greenfoxacademy;

import java.util.Scanner;

public class CountFromTo {

    public static void main(String[] args) {
      // Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one
//
// example:
//
// first number: 3, second number: 6, should print:
//
// 3
// 4
// 5
      Scanner userinput= new Scanner(System.in);
      System.out.println("Enter 2 numbers. the 2nd number should be bigger");
      int num1=userinput.nextInt();
      int num2=userinput.nextInt();

      if(num1>num2){
        System.out.println("The second number should be bigger ");
      } else if(num2>num1){
        for (int i=num1;i<num2;i++){
          System.out.println(i);
        }
      }

    }
}
