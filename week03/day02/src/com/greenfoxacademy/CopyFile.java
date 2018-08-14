package com.greenfoxacademy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CopyFile {
  public static void main(String[] args) {
// Write a function that copies a file to an other
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful
    Scanner userinput=new Scanner(System.in);
    System.out.println("enter the new file name where u want to copy the file");
    String newfile=userinput.nextLine();


    System.out.println(funcCopyFile(newfile,"WriteMultipleLines.txt"));

  }

  private static boolean funcCopyFile(String newfile, String s) {

    Path path=Paths.get(s);
    try {
      List<String> file= Files.readAllLines(path);
      Files.write(Paths.get(newfile),file);
    } catch (IOException e) {
      e.printStackTrace();
    }

    return true;
  }

}
