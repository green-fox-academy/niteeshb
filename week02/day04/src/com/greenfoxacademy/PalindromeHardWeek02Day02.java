package com.greenfoxacademy;

import java.util.Scanner;

public class PalindromeHardWeek02Day02 {

  public static void main(String[] args) {
    System.out.println("enter the word you want to check for PALINDROME");
    Scanner userinput = new Scanner(System.in);
    String sentence = userinput.nextLine();
    for (int i = 1; i < (sentence.length() - 1); i++) {
      int afterI = i + 1;
      int beforeI = i - 1;
      while (sentence.charAt(afterI) == sentence.charAt(beforeI)) {
        System.out.println(sentence.substring(beforeI, afterI + 1));
        if (afterI > (sentence.length()-1) || beforeI < 1) {
          break;
        } else {

          beforeI--;
          afterI++;
        }

      }
      while (sentence.charAt(afterI-1 ) == sentence.charAt(beforeI )) {
        System.out.println(sentence.substring(beforeI-1, afterI+1));
        if (afterI > (sentence.length() - 2) || beforeI < 2) {
          afterI-=2;
          break;
        } else {

          beforeI--;
          afterI++;
        }

    }
  }
}}