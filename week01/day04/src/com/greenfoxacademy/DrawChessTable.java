package com.greenfoxacademy;

public class DrawChessTable {
  public static void main(String[] args) {
    // Crate a program that draws a chess table like this
//
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
//
    int b;
    for (int i=1; i<=8;i++){
      for ( b=1; b<=4; b++){
        System.out.print("%");
      }
      System.out.println();
    }
  }
}
