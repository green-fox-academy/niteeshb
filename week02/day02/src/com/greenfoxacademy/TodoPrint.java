package com.greenfoxacademy;
public class TodoPrint {
  public static void main(String... args){
    // Add "My todo:" to the beginning of the todoText
    // Add " - Download games" to the end of the todoText
    // Add " - Diablo" to the end of the todoText but with indention

    // Expected outpt:

    // My todo:
    //  - Buy milk
    //  - Download games
    //      - Diablo

    StringBuilder todoText = new StringBuilder(" - Buy milk");
    todoText.insert(0,"My todo:");
    System.out.println(todoText);

    todoText.append(" - Download games");
    System.out.println(todoText);

    todoText.append("\b - Diablo");
    System.out.println(todoText);
  }
}