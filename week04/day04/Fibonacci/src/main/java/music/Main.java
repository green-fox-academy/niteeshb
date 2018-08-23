package main.java.music;

import java.util.Scanner;

public class Main {

    public static void main (String[]args){
      Scanner userinput = new Scanner(System.in);
      System.out.println("Enter the number for fibnacci series");
      int number = userinput.nextInt();
      Fibonacci fibonacci=new Fibonacci();
      fibonacci.findFibonacchi(number);


    }
  }

