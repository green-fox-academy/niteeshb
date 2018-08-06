package com.greenfoxacademy;

import java.util.Scanner;

public class GuessTheNumber {
  public static void main(String[] args) {
    // Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stried number is lower
// You found the number: 8

    Scanner userinput=new Scanner(System.in);
    System.out.println("Guess the number");
    int numb=0;
    int guessNumber=8;
    if(numb==guessNumber) {
      System.out.println("Bingo. u got the number");
    } else{
    while(numb!=guessNumber){
      numb =userinput.nextInt();
     if (numb>guessNumber){
       System.out.println("the Stored number is higher. Enter Again");
     }else if( numb<guessNumber){
       System.out.println("the stored number is lower. Enter again");
     }else if(numb==guessNumber) {
        System.out.println("Bingo. u got the number");
      }

    }
  }
}}
