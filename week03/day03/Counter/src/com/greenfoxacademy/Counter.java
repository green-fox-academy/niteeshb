package com.greenfoxacademy;

public class Counter {

  static int counter;
  int reset=0;
  public Counter(){
    counter=0;
  }

  public Counter(int counter){
    this.counter=counter;
    reset=counter;
    System.out.println(counter);
  }

  public void add(int num){
    counter+=num;
    System.out.println(counter);
  }

  public void add(){
    counter++;
    System.out.println(counter);
  }

  public int get(){
    System.out.println(counter);
    return counter;

  }

  public void reset(){
    if (reset>0){
      counter=reset;
    }else counter=0;
    System.out.println(counter);
  }
}
