package com.greenfoxacademy;

import java.util.Scanner;

public class NumberAdder {

    public static void main(String[] args) {
	// write your code here
      Scanner userinput=new Scanner(System.in);
      System.out.println("Enter the number of which u want to find the sum");
      int number=userinput.nextInt();
      System.out.println("The sum of numbers is : " + counter(number));
    }

  private static int counter(int number) {

      if(number==1){
        return 1;
      } else return (counter(number-1)+number);
  }
}
