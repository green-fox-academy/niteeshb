package main.java.music;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
      Scanner userinput=new Scanner(System.in);
      System.out.println("enter 2 string");
      String string1=userinput.nextLine();
      String string2=userinput.nextLine();

      Anagram anagram=new Anagram();
      System.out.println(anagram.check(string1,string2));
    }
}