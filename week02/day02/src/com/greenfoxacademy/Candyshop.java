package com.greenfoxacademy;
import java.util.*;

public class Candyshop{
  public static void main(String... args){


    // Accidentally we added "2" and "false" to the list.
    // Your task is to change from "2" to "Croissant" and change from "false" to "Ice cream"
    // No, don't just remove the lines
    // Create a method called sweets() which takes the list as a parameter.
    ArrayList<Object> arrayList = new ArrayList<Object>();
    arrayList.add("Cupcake");
    arrayList.add(2);
    arrayList.add("Brownie");
    arrayList.add(false);
    System.out.println(sweets(arrayList));
    // Expected output: "Cupcake", "Croissant", "Brownie", "Ice cream"
  }

  public static ArrayList sweets(ArrayList sweets){
    for (int i=0;i<sweets.size(); i++){
      if (sweets.get(i).equals(2)) {
        sweets.set(i, "croissant");
      } else if (sweets.get(i)=="false"){
        sweets.set(i,"Ice-cream");
      }
    }
    return sweets;
  }
}