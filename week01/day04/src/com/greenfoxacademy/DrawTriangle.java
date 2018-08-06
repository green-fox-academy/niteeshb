package com.greenfoxacademy;

public class DrawTriangle {
  public static void main(String[] args) {
    for (int i=1; i<=4; i++){
      for(int b=1; b<=i;b++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
