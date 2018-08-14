package com.greenfoxacademy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.
public class CountLines {
  public static void main(String[] args) {
Path path= Paths.get("my_file.txt");
    try {
      List list= Files.readAllLines(path);
      System.out.println("The number of lines in:  "+ list.size());
    } catch (IOException e) {
      System.out.println(0);;
    }


  }
}
