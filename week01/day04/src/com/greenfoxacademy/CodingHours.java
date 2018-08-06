package com.greenfoxacademy;
public class CodingHours {
  public static void main(String[] args) {
    // An average Green Fox attendee codes 6 hours daily
    // The semester is 17 weeks long
    //
    // Print how many hours is spent with coding in a semester by an attendee,
    // if the attendee only codes on workdays.
    //
    // Print the percentage of the coding hours in the semester if the average
    // work hours weekly is 52

    int weeks=17;
    int days=5;
    int hours=6;

    int totalHours= hours*days*weeks;
    double perOfWork=((17.0*5.0*6.0)/(52.0*17.0))*100;
    System.out.println("no of hours worked by attendee is :  "  + totalHours);
    System.out.println( perOfWork);


  }
}