package com.greenfoxacademy;

public class Bmi {
  public static void main(String[] args) {
    double massInKg = 81.2;
    double heightInM = 1.78;

    // Print the Body mass index (BMI) based on these values
  double bmi=massInKg/(heightInM*heightInM);
  System.out.println("the bmi is :" + bmi);

// TO REDUCE THE NUMBER OF DECIMALS
    double x = Math.floor(bmi * 100) / 100;
    System.out.println(x);
  }
}
