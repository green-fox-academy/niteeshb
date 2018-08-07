package com.greenfoxacademy;

import java.util.Scanner;

public class PrintParams {
  public static void main(String[] args) {
    //  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `printParams`
//   which prints the input String parameters
// - It can have any number of parameters

// Examples
// printParams("first")
// printParams("first", "second")
// printParams("first", "second", "third", "fourh")
// ...
    String prin = "printParams (";
    Scanner userinput=new Scanner(System.in);
    System.out.println("enter the number of parameters u want to give");
    int noOfStrings=userinput.nextInt();
    for (int i=1; i<=noOfStrings; i++){
      prin= prin + " "+ ", " +printParams();

    }
    System.out.println(prin);
  }
  public static String printParams(){

    Scanner userinput=new Scanner(System.in);
    System.out.println("enter the parameters");
    String noOfStrings=userinput.nextLine();
    return noOfStrings;

  }

}
