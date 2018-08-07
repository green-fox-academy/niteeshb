package com.greenfoxacademy;
import java.util.*;

public class SolarSystem{
  public static void main(String... args){

    // Saturn is missing from the planetList
    // Insert it into the correct position
    // Create a method called putSaturn() which has list parameter and returns the correct list.
    ArrayList<String> planetList = new ArrayList<String>(Arrays.asList("Mercury","Venus","Earth","Mars","Jupiter","Uranus","Neptune"));
int locationOfSaturn=5;
    System.out.println(putSaturn(planetList,locationOfSaturn));
    // Expected output: "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Uranus", "Neptune", "Saturn"


  }

  public static ArrayList putSaturn(ArrayList planetList, int index){

    planetList.add(index,"Saturn");

    return(planetList);
  }


}