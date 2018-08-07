import java.util.Scanner;

public class Unique {
  public static void main(String[] args) {
    //  Create a function that takes a list of numbers as a parameter
    //  Returns a list of numbers where every number in the list occurs only once

    //  Example

    Scanner userinput=new Scanner(System.in);
    System.out.println("enter the numbers that you want to enter in the array");
    int lengthOfArray=userinput.nextInt();
    int array[]=new int[lengthOfArray];
    System.out.println("enter the array elements");
    for (int i=0; i<lengthOfArray;i++){

      array[i]=userinput.nextInt();
    }
    for (int i:array){
      System.out.print(i);
    }
    System.out.println();
    //System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
    //  should print: `[1, 11, 34, 52, 61]`
    int newArray[]=new int[lengthOfArray];

    for (int i = 0; i <lengthOfArray-1; i++) {
      int z=0;
      for (int j = i+1; j < lengthOfArray; j++) {
        if (array[i]==array[j]) {
          z = 1;
        }     }

      if (z!=1){
        System.out.print(array[i]);

        }

    }

  }
}