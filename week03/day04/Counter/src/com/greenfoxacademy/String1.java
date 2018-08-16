package com.greenfoxacademy;

import java.util.Scanner;

public class String1 {
  // Given a string, compute recursively (no loops) a new string where all the
// lowercase 'x' chars have been changed to 'y' chars.
  public static void main(String[] args) {
    Scanner userinput=new Scanner(System.in);
    System.out.println("Enter the String");
    String string=userinput.nextLine();
    System.out.println( string1(string));
  }

  private static String string1(String string) {
    int x=string.indexOf('x');
    if(x==-1){
      return string;
    }else
      string=string.substring(0,x)+"y"+string.substring(x+1);
    System.out.println(string);
    return string1(string);
  }
}
