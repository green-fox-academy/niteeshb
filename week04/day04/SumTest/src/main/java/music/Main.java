package main.java.music;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    // write your code here

    ArrayList<Integer> integer = new ArrayList<>();
    integer.add(2);
    integer.add(1);
    integer.add(4);
    integer.add(5);
    integer.add(8);
    integer.add(2);


    //sum(integer);
  }

  public int sum(ArrayList<Integer> integer) {
    int sum = 0;
    for (int i = 0; i < integer.size(); i++) {
      sum += integer.get(i);
    }
    return sum;
  }
}