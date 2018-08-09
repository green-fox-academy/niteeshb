package com.greenfoxacademy;

import java.util.Scanner;

public class PalindromeBuilder {
  public static void main(String[] args) {
//    "greenfox"	"greenfoxxofneerg"
//    "123"	"123321"

    Scanner userinput=new Scanner(System.in);
    System.out.println("Enter string for Palindrom");
    String stringForPalindrom=userinput.nextLine();
    String newPalindrom= stringForPalindrom;
    for (int i=stringForPalindrom.length();i>0;i--){
      newPalindrom=newPalindrom+ stringForPalindrom.charAt(i-1);
    }
    System.out.println(newPalindrom);
  }
}
