package com.greenfoxacademy;

import java.util.Scanner;

public class String2 {
  // Given a string, compute recursively a new string where all the 'x' chars have been removed
  public static void main(String[] args) {
    Scanner userinput=new Scanner(System.in);
    System.out.println("Enter the String u want to remove \"x\" from" );
    String string=userinput.nextLine();
    System.out.println( string1(string));
  }

  private static String string1(String string) {
    int x=string.indexOf('x');
    if(x==-1){
      return string;
    }else
      string=string.substring(0,x)+string.substring(x+1);
    System.out.println(string);
    return string1(string);
  }
}

