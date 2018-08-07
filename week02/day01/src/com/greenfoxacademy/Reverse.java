package com.greenfoxacademy;

public class Reverse {
  public static void main(String[] args) {
    // - Create an array variable named `aj`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `aj`
// - Print the elements of the reversed `aj`

    int aj[]={3,4,5,6,7,10};
    for (int i=0; i<=aj.length/2; i++){
      int j=aj[i];
      aj[i]=aj[aj.length-(1+i)];
      aj[aj.length-(1+i)]=j;
    }
    for (int i: aj){
      System.out.println(i);
    }
  }
}
