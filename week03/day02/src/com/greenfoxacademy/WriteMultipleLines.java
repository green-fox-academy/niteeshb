package com.greenfoxacademy;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteMultipleLines {
  public static void main(String[] args) {
// Create a function that takes 3 parameters: a path, a word and a number,
// than it should write to a file.
// The path parameter should be a string, that describes the location of the file.
// The word parameter should be a string, that will be written to the file as lines
// The number paramter should describe how many lines the file should have.
// So if the word is "apple" and the number is 5, than it should write 5 lines
// to the file and each line should be "apple"
// The function should not raise any error
    Scanner userinput=new Scanner(System.in);

    Path path=Paths.get("WriteMultipleLines.txt");
    System.out.println("enter String");
String userString=userinput.nextLine();
    System.out.println("enter the number of Lines as interger");
    int line=userinput.nextInt();

    funcWriteMultipleLine(path,userString,line);

  }

  private static void funcWriteMultipleLine(Path path, String userString, int line) {
    List<String> list = new ArrayList<>();
    for (int i=0; i<line;i++ ) {

      list.add(userString);
    }
    try {
      Files.write(path,list);
    } catch (IOException e) {

    }
  }
}
