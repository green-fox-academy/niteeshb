package com.greenfoxacademy;

import java.util.Scanner;

public class Bunny2 {
  // We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
// (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
// have 3 ears, because they each have a raised foot. Recursively return the
// number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).
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
      return 0;
    } else
      if (number%2==0){
        return 3+(counterEar(number-1));
      }else
    return 2+(counterEar(number-1));
  }
}


