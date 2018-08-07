package com.greenfoxacademy;


import java.util.ArrayList;
import java.util.Arrays;

public class ElementFinder{
    // Write a method that checks if the arrayList contains "7" if it contains return "Hoorray" otherwise return "Noooooo"
    // The output should be: "Noooooo"
    // Do this again with a different solution using different list methods!
    public static void main(String... args){
      ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
      System.out.println(containsSeven(arrayList));

    }

    public static String containsSeven(ArrayList arrayList){
      String prin="";
      for (int i=0;i<arrayList.size(); i++){
        if (arrayList.contains(4)){
          prin="hoorraaayyy";
        }else
          prin="Noooooooo";
      }
      return prin;
    }
}