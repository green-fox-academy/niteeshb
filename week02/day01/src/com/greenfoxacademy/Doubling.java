package com.greenfoxacademy;

public class Doubling {
  public static void main(String[] args) {
    // - Create an integer variable named `baseNum` and assign the value `123` to it
// - Create a function called `doubling` that doubles it's input parameter and returns with an integer
// - Print the result of `doubling(baseNum)`
    int baseNum=123;
    int x=doubling(baseNum);
    System.out.println(x);

  }

  public static int doubling(int a){
    a=a*2;
    return a;
  }
}
