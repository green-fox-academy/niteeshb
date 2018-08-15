package com.greenfoxacademy;

public class Main {

    public static void main(String[] args) {
	// write your code here
      PostIt object1= new PostIt();
      PostIt object2= new PostIt();
      PostIt object3= new PostIt();
      object1.backGroundColor="Orange";
      object1.textColor="blue";
      object1.text="Idea 1";
      object2.backGroundColor="pink";
      object2.textColor="black";
      object2.text="Awesome";
      object3.backGroundColor="Yellow";
      object3.textColor="green";
      object3.text="Superb";

      System.out.println(object1.backGroundColor+ object1.text+object1.textColor);
    }
}
