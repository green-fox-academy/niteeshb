package main.java.music;

import java.util.Scanner;

public class Fibonacci {



  public int findFibonacchi(int number) {

    if (number<=0){
      return 0;
    }else if(number==1){
      return 1;
    }else{
//      System.out.print(number);
      return findFibonacchi(number-1)+ findFibonacchi(number-2);
    }
  }
}
