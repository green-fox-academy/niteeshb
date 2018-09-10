package com.greenfoxacademy;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class ReadFile {
  public static void main(String[] args) {
    String temp=null;
    try { // Required by Files.readAllLines(filePath);
      // Reads the content from `lorem-psum.txt` in the `assets` folder line by line to a String List
      Path filePath = Paths.get("C:\\Users\\SwapNit\\greenfox\\niteeshb\\week03\\day02\\my_file.txt");
      List<String> lines = Files.readAllLines(filePath);
      for (int i=0;i<lines.size();i++) {
        if (lines.get(i).contains("//")) {
          lines.remove(i);
          System.out.println(lines); // Prints the first line of the file
        }
      }
      Files.write(filePath,lines);

       } catch (Exception e) {
      System.out.println("Uh-oh, could not read the file!");
    }
  }
}
