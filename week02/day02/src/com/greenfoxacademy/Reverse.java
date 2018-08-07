package com.greenfoxacademy;
public class Reverse {
  public static void main(String... args){


    // Create a method that can reverse a String, which is passed as the parameter
    // Use it on this reversed string to check it!
    // Try to solve this using charAt() first, and optionally anything else after.
    StringBuilder reversed = new StringBuilder(".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI");
    int length= reversed.length();
    String s="";
    for(int i=length-1;i>=0;i--) {
      s = s + reversed.charAt(i);
    }
    System.out.println(s);
  }
}