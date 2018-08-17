package com.greenfoxacademy;

import java.util.Scanner;

public class Refactorio {

// Create a recursive function called `refactorio`
// that returns it's input's factorial
  public static void main(String[] args) {
    Scanner userinput=new Scanner(System.in);
    System.out.println("Enter the number for factorial");
    int number=userinput.nextInt();
    System.out.println("Factorial is " + (refactorio(number)));
  }

  private static int refactorio(int number) {

    if (number==1){
    return 1;
  }else{
    return number*refactorio(number-1);
  }

}}

