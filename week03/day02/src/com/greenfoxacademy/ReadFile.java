package com.greenfoxacademy;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class ReadFile {
  public static void main(String[] args) {
    try { // Required by Files.readAllLines(filePath);
      // Reads the content from `lorem-psum.txt` in the `assets` folder line by line to a String List
      Path filePath = Paths.get("E:\\softwares\\setup.docx");
      List<String> lines = Files.readAllLines(filePath);
      for (String s : lines) {
        System.out.println(s); // Prints the first line of the file
      }
    } catch (Exception e) {
      System.out.println("Uh-oh, could not read the file!");
    }
  }
}
