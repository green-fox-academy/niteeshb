package com.greenfoxacademy;

public class TakesLonger {
  public static void main(String [] args){
    StringBuilder quote = new StringBuilder("Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.");

    // When saving this quote a disk error has occured. Please fix it.
    // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
    // Using pieces of the quote variable (instead of just redefining the string)
    int x=quote.indexOf(" you");
    quote.insert(x," always takes longer than" );
    System.out.println(quote);
  }
}