package com.greenfoxacademy;

public class Swap {
  public static void main(String[] args) {
    // Swap the values of the variables
    int a = 123;
    int b = 526;
    System.out.println("initial values of a and b are: " +a + "   " +b);

    int c=a;a=b;b=c;
    System.out.println("values of a and b after swapping are: " +a + "   " +b);

  }
}