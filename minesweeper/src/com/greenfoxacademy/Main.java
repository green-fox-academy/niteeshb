package com.greenfoxacademy;

import java.util.Random;
import java.util.Scanner;

public class Main {

  static int[][] GAME_STATE = new int[10][10];
  static int MINE = 1;
  static int REVEALED = 2;
  static int NOT_REVEALED = 0;
  static String COLUMNS = "abcdefghij";

  public static void main(String[] args) {
    generateMap();
    Scanner scanner = new Scanner(System.in);
    while (true) {
      printGameTable();
      if(winning()) {
        System.out.println("Congrats! You won the game, master!");
        break;
      }
      System.out.println("Okay, what is your guess?");
      String guess = scanner.nextLine();
      int row = getRow(guess);
      int column = getColumn(guess);
      if (GAME_STATE[row][column] == MINE) {
        System.out.println("You died, you miserable little shit.");
        break;
      } else {
        GAME_STATE[row][column] = 2;
      }
    }
  }

  private static boolean winning() {
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        if (GAME_STATE[i][j] == NOT_REVEALED)
          return false;
      }
    }
    return true;
  }

  //  1 0 0
  //  0 x 1
  //  0 0 0
  //

  static int getNeighbours(int row, int column) {
    int counter = 0;
    if (row > 0 && GAME_STATE[row-1][column] == MINE)
      counter++;
    if (row < 9 && GAME_STATE[row+1][column] == MINE)
      counter++;
    if (column > 0 && GAME_STATE[row][column-1] == MINE)
      counter++;
    if (column < 9 && GAME_STATE[row][column+1] == MINE)
      counter++;
    if (row > 0 && column > 0 && GAME_STATE[row-1][column-1] == MINE)
      counter++;
    if (row > 0 && column < 9 && GAME_STATE[row-1][column+1] == MINE)
      counter++;
    if (row < 9 && column > 0 && GAME_STATE[row+1][column-1] == MINE)
      counter++;
    if (row < 9 && column < 9 && GAME_STATE[row+1][column+1] == MINE)
      counter++;

    return counter;
  }

  private static void printGameTable() {
    System.out.println(" " + COLUMNS);

    for (int i = 0; i < 10; i++) {
      System.out.print(i);
      for (int j = 0; j < 10; j++) {
        if (i == 0) {

        }
        if (GAME_STATE[i][j] == REVEALED)
          System.out.print(getNeighbours(i, j));
        else
          System.out.print("#");
      }
      System.out.println();
    }
  }

  static void generateMap() {
    Random random = new Random();
    for (int i = 0; i < 7;) {
      int x = random.nextInt(10);
      int y = random.nextInt(10);
      if (GAME_STATE[x][y] != MINE) {
        GAME_STATE[x][y] = MINE;
        i++;
      }
    }
  }

  static int getRow(String guess) {
    return Integer.valueOf(guess.substring(1));
  }

  static int getColumn(String guess) {
    return COLUMNS.indexOf(guess.substring(0, 1));
  }
}