package com.greenfoxacademy;

import java.util.Scanner;

public class Arpi {
  public static void main(String[] args) {
    System.out.println("Do you remember our first talk ? ");
    Scanner Sc = new Scanner(System.in);
    String res = Sc.nextLine();
    System.out.println("Do you remember when I said may be you will fall in love and get pregnant ? ");

    String res2 = Sc.nextLine();

    System.out.println("Do you remember when you become so angry and started to shout, who are you and why you talking about me been pregnant ?!! ");

    String res3 = Sc.nextLine();


    System.out.println("So now you are in love? ");

    String res4 = Sc.nextLine();

    System.out.println(" what about working on the second part of my prophecy ? ");


    System.out.println();
    System.out.println();


    int H = 7, W = 7;
    for (int i = 2; i <= (H + 1) / 2; i++) {

      for (int j = 0; j < W / 2 - i; j++) {
        System.out.print(" ");
      }
      for (int k = 1; k < (i + 1) * 2 + 1; k++) {
        System.out.print("*");
      }

      if (i == 2) {
        System.out.print(" ");
      }

      for (int j = 0; j < W / 2 - i + 1; j++) {
        System.out.print(" ");
      }

      for (int k = 1; k < (i + 1) * 2 + 1; k++) {
        if (i == (H + 1) / 2 && k > i + 3)
          System.out.print("");
        else
          System.out.print("*");
      }
      System.out.println();

    }
    int HH = 17, WW = 17;
    for (int i = 1; i <= HH / 2; i++) {

      for (int j = 1; j <= i; j++) {
        System.out.print(" ");
      }
      int z = WW - 2 * i;
      for (int k = 1; k <= z; k++) {
        System.out.print("*");
      }
      System.out.println();
    }


  }
}


