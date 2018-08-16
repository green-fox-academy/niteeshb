package com.greenfoxacademy;

import java.util.Scanner;

public class String3 {
//   Given a string, compute recursively a new string where all the
// adjacent chars are now separated by a "*".
  public static void main(String[] args) {
    Scanner userinput=new Scanner(System.in);
    System.out.println("Enter the String");
    String string=userinput.nextLine();
    System.out.println( string1(string,string.length()-1));
  }

  private static String string1(String string,int length) {

    if(length<=0){
      return string;
    }else
      string=string.substring(0,length)+"*"+string.substring(length);
    System.out.println(string);
    return string1(string,length-1);
  }





}
