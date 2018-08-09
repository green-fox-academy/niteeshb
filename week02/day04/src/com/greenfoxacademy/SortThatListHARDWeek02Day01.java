package com.greenfoxacademy;


import java.sql.Array;

public class SortThatListHARDWeek02Day01 {

  public static void main(String[] args) {
    //  Create a function that takes a list of numbers as parameter
    //  Returns a list where the elements are sorted in ascending numerical order
    //  Make a second boolean parameter, if it's `true` sort that list descending

    //  Example:
//      System.out.println(bubble(new int[] {34, 12, 24, 9, 5}));
//        should print [5, 9, 12, 24, 34]
//      System.out.println(advancedBubble(new int[] {34, 12, 24, 9, 5}, true));
    //  should print [34, 24, 12, 9, 5]
    int bubble[] = {34, 12, 24, 9, 5};
    for (int i = 0; i < bubble.length; i++) {
      for (int j = i; j < bubble.length; j++) {
        int temp = 0;
        if (bubble[i] > bubble[j]) {
          temp = bubble[i];
          bubble[i] = bubble[j];
          bubble[j] = temp;
        }
      }
    }
    for (int i : bubble)
      System.out.print(i + " ,");
  }
}