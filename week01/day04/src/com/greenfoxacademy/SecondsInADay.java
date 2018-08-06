package com.greenfoxacademy;

public class SecondsInADay {
  public static void main(String[] args) {
    int currentHours = 14;
    int currentMinutes = 34;
    int currentSeconds = 42;

    // Write a program that prints the remaining seconds (as an integer) from a
    // day if the current time is represented by the variables
  int totalSecsInaDay=24*60*60;
  int secSpent=currentHours*3600+currentMinutes*60+currentSeconds;
    System.out.println("number of sec remaining in day is  " + (totalSecsInaDay-secSpent));
  }
}
