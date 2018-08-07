package com.greenfoxacademy;

import java.util.Scanner;

public class Factorio {
  public static void main(String[] args) {
    //  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial
    Scanner userinput=new Scanner(System.in);
    System.out.println("enter te number u want to find the factorio");
    int num=userinput.nextInt();
    int x=factorio(num);
    System.out.println("the factorio is " + x);
  }

  public static int factorio(int x){
    int a=1;
    for (int i=1; i<=x; i++){
      a=a*i;
    }
    return a;
  }
}
