package com.greenfoxacademy;

public class CompareLength {
  public static void main(String[] args) {
    // - Create an array variable named `p1`
//   with the following content: `[1, 2, 3]`
// - Create an array variable named `p2`
//   with the following content: `[4, 5]`
// - Print if `p2` has more elements than `p1`
    int p1[]={1,2,3};
    int p2[]={4,5,6,7,8};
    if (p2.length>=p1.length){
      for(int i:p2){
        System.out.println(i + 1);
      }
      }else {
      System.out.println("length of p1 is greater than p2");
    }
    }
  }

