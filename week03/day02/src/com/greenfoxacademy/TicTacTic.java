package com.greenfoxacademy;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class TicTacTic {
//  Write a function that takes a filename as string,
  // open and read it. The file data represents a tic-tac-toe
  // game result. Return 'X'/'O'/'draw' based on which player
  // has winning situation.
  public static void main(String[] args) {
    Scanner userinput=new Scanner(System.in);
    String name=userinput.nextLine();
    Path filePath = Paths.get(name);
    tictactoe(filePath);
  }

  private static void tictactoe(Path filePath) {
    try {
      ArrayList<String> content= (ArrayList<String>) Files.readAllLines(filePath);
      for (int i=0;i<content.size();i++){
        for (int j=0; j<content.size();j++){


        }

      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
