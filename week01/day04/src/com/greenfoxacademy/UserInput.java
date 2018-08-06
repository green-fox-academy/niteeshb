package com.greenfoxacademy;

// Loads the scanner to the file
import java.util.Scanner;

  public class UserInput {
    public static void main(String[] args) {
      System.out.println("enter a string");
     // do {
      Scanner scanning= new Scanner((System.in));


//      String userinput3;

        String userInput = scanning.nextLine();


        System.out.println(userInput);
        System.out.println("enter a number");
        int userinput2 = scanning.nextInt();
        System.out.println(userinput2);
        System.out.println("would you like to enter more: True /False");
        String userinput3=scanning.nextLine();
//      } while (userinput3=="true");
    }
  }
