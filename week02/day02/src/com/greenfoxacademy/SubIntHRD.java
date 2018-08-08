package com.greenfoxacademy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SubIntHRD {
  public static void main(String[] args) {
    //  Create a function that takes a number and a list of numbers as a parameter
    //  Returns the indeces of the numbers in the list where the first number is part of
    //  Returns an empty list if the number is not part any of the numbers in the list

    //  Example:
//    System.out.println(subInt(1, new int[] {1, 11, 34, 52, 61}));
//      should print: `[0, 1, 4]`
//    System.out.println(subInt(9, new int[] {1, 11, 34, 52, 61}));
//      should print: '[]'
    ArrayList<Integer> listOfInteger=new ArrayList<>(Arrays.asList(1,11,34,52,61));
    Scanner userinput=new Scanner(System.in);
    System.out.println("Enter the number you want to serach as Sub-Integer in List");
    int subInteger=userinput.nextInt();
    System.out.println(subInt(subInteger, listOfInteger));
  }

  public static String subInt(Integer subInteger, ArrayList<Integer> listOfInteger){
    String result="";
    String stringOfSubElement=subInteger.toString();

    for (int i=0;i<listOfInteger.size();i++){
      String stringOfListElement= (listOfInteger.get(i)).toString();
      if (stringOfListElement.contains(stringOfSubElement)){
      result=result+stringOfListElement+" ,";
      }
    }

    return result;
  }
}