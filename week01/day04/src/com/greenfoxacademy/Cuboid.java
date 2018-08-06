package com.greenfoxacademy;

public class Cuboid {
  public static void main(String[] args) {
    // Write a program that stores 3 sides of a cuboid as variables (doubles)
// The program should write the surface area and volume of the cuboid like:
//
// Surface Area: 600
// Volume: 1000

    double side=10;
    double surfaceArea= 6*side*side;
    double volumn=side*side*side;

    System.out.println("the surface area is:  "+ surfaceArea);
    System.out.println("the volumn is :  " + volumn );
  }
}
