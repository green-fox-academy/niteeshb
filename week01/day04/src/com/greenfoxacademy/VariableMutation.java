package com.greenfoxacademy;

public class VariableMutation {
  public static void main(String[] args) {
    int a = 3;
    // make it bigger by 10
a+=10;

    System.out.println(a);




    int b = 100;
    // make it smaller by 7
b-=7;

    System.out.println(b);




    int c = 44;
    // please double c's value
c+=c;

    System.out.println(c);




    int d = 125;
    // please divide by 5 d's value

d=d/5;
    System.out.println(d);




    int e = 8;
    // please cube of e's value

e=e*e*e;
    System.out.println(e);




    int f1 = 123;
    int f2 = 345;
    // tell if f1 is bigger than f2 (print as a boolean)

if (f1>f2){
  System.out.println("f1 is bigger than f2:  true");
}
//else{
//  System.out.println("f2 is bigger");
//}


    int g1 = 350;
    int g2 = 200;
    // tell if the double of g2 is bigger than g1 (print as a boolean)
boolean g3=g2*2>g1;
if (g3){
  System.out.println("double of g2 is bigger than g1  :  " + g3);
}


    int h = 135798745;
    // tell if it has 11 as a divisor (print as a boolean)
int h2= (h % 11);
if (h2==0){
  System.out.println("h is divisible by 11");
}
else{
  System.out.println("the reminder is  " + (h%11));
}




    int i1 = 10;
    int i2 = 3;
    // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)
if ((i1>(i2*i2))&& (i1<(i2*i2*i2)))
{
      System.out.println("i1 is higher than i2 squared and smaller than i2 cubed:  true");
    }
    else{
      System.out.println("i1 is higher than i2 squared and smaller than i2 cubed: flase");
    }



    int j = 1521;
    // tell if j is dividable by 3 or 5 (print as a boolean)
if ((j%3==0) ||(j%5==0)){
      System.out.println("j is dividable by 3 or 5: true ");
    }
    else{
      System.out.println("j is dividable by 3 or 5: false");
    }



    String k = "Apple";
    //fill the k variable with its cotnent 4 times

k=k+k+k+k;
    System.out.println(k);
  }
}
