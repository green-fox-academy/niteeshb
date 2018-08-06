package com.greenfoxacademy;

import java.util.Scanner;

public class HelloUser {
  public static void main(String[] args) {
    // Modify this program to greet user instead of the World!
    // The program should ask for the name of the user
    Scanner name= new Scanner(System.in);
    System.out.println("enter your name");
    String username=name.nextLine();
    System.out.println("Hello  " + username);
  }
}
