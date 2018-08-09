package com.greenfoxacademy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class UniqueHARDWeek02Day01 {
  public static void main(String[] args) {
    //System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
    //  should print: `[1, 11, 34, 52, 61]`

    Scanner userinput = new Scanner(System.in);
//    System.out.println("enter the numbers that you want to enter in the array");
//    int lengthOfArray=userinput.nextInt();
    ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 76, 11, 34, 11, 52, 61, 1,23, 34));
    ArrayList<Integer> newArray = new ArrayList<>();
    newArray.add(array.get(0));
    //System.out.println("enter the array elements");
    for (int i = 1; i < array.size(); i++) {
      int count = 0;
      for (int j = 0; j < i; j++) {
        if (array.get(i) == array.get(j)) {
          count++;
          break;
        }
      }
      if (count == 0) {
        newArray.add(array.get(i));
      }
    }
    System.out.println(newArray.toString());


  }
}