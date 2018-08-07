package com.greenfoxacademy;

public class AppendA {
  public static void main(String[] args) {
    // - Create an array variable named `animals`
//   with the following content: `["koal", "pand", "zebr"]`
// - Add all elements an `"a"` at the end

    String animals[]={"koal","Pand","zebr"};
    for (String s: animals){
      s=s+"a";
      System.out.println(s);
    }

  }
}
