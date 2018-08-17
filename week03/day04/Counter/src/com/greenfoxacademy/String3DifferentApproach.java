package com.greenfoxacademy;

import java.util.Scanner;

public class String3DifferentApproach {


  public static void main(String[] args) {
//    Scanner userinput=new Scanner(System.in);
//    System.out.println("Enter the String");
//    String string=userinput.nextLine();
//    System.out.println( string1(string));
    String st="hs";
    String st2="sh";
    System.out.println(st.compareTo(st2));
  }

  private static String string1(String string) {

    if(string.length()<=1){
      return string;
    }else

    return string.substring(0,1)+'*'+ string1(string.substring(1));
  }
}
