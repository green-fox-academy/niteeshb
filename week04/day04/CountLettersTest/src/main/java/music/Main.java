package main.java.music;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // write your code here

    Scanner userinput = new Scanner(System.in);
    System.out.println("Enter a string");
    String string = userinput.nextLine();

    Count count = new Count();
    HashMap dict = new HashMap<>();
    dict = (count.countAlphabets(string));
    System.out.println(dict);
  }
}
