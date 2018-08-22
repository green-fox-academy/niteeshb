package com.greenfoxacademy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Domino implements Comparable{
  private final int[] values;

  public Domino(int valueA, int valueB) {
    this.values = new int[]{valueA, valueB};
  }

  public int[] getValues() {
    return values;
  }

  @Override
  public String toString() {
    return "[" + values[0] + ", " + values[1] + "]";
  }

  static ArrayList<Domino> sortDomino(List<Domino> dominoes) {
    ArrayList<Domino> newdominos= new ArrayList<>();
    newdominos.add(dominoes.get(0));
    for (int i = 0; i < dominoes.size() - 1; i++)
      for (int k = i + 1; k < dominoes.size(); k++) {

        if ((newdominos.get(newdominos.size()-1).getValues()[1])
                == (dominoes.get(k).getValues()[0])) {

          newdominos.add( dominoes.get(k));
          //System.out.println(dominoes.get(i).getValues());
          break;
        }
        ((newdominos.get(newdominos.size()-1).getValues()[1]).
      }
    return newdominos;
  }

  @Override
  public static int compareTo(Object o) {
    return 0;
  }
}