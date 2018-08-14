package com.greenfoxacademy;
 // Write a program that opens a file called "my-file.txt", then prints
    // each of the lines form the file.
    // If the program is unable to read the file (for example it does not exists),
    // then it should print an error message like: "Unable to read file: my-file.txt"

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class ReadFile {
      public static void main(String[] args) {
        try { // Required by Files.readAllLines(filePath);
          // Reads the content from `lorem-psum.txt` in the `assets` folder line by line to a String List
          Path filePath = Paths.get("assets/lorem-ipsum.txt");
          List<String> lines = Files.readAllLines(filePath);
          for (String s: lines ) {


            System.out.println(s); // Prints the first line of the file
          }
          } catch (Exception e) {
          System.out.println("Uh-oh, could not read the file!");
        }
      }
    }
