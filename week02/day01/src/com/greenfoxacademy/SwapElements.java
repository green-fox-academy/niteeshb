package com.greenfoxacademy;

public class SwapElements {
  public static void main(String[] args) {
    // - Create an array variable named `abc`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `abc`
    String abc[]={"first","second","third"};
    String s=abc[0];
    abc[0]=abc[2];
    abc[2]=s;
    for (String v:abc){
    System.out.println(v);
} }
}
