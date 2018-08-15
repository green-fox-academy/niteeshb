package com.greenfoxacademy;

public class Main {

  public static void main(String[] args) {
    DiceSet diceSet = new DiceSet();

    diceSet.roll();

    for (int i = 0; i < 6; i++) {
      while (diceSet.dices[i] != 6) {
        diceSet.reroll(i);
      }
    }
    for (int i = 0; i < 6; i++) {
      System.out.println(diceSet.dices[i]);
    }

//
//
//
//
//    diceSet.getCurrent();
//    diceSet.getCurrent();
//
//    diceSet.getCurrent(5);
//
//
//    diceSet.reroll();
//
//
//    diceSet.getCurrent();
//
//
//    diceSet.reroll(4);
//
//
//    diceSet.getCurrent();
  }
}