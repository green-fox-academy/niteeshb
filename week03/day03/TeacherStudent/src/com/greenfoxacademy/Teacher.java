package com.greenfoxacademy;

import java.util.Scanner;

public class Teacher {
String teachername;
Scanner userinput=new Scanner(System.in);

  public void answer(String question, String teachername) {
    if (this.teachername.equals(teachername)){
      System.out.println("the Question is : "+ question);
      String answer =userinput.nextLine();
      System.out.println("The ans to this question is : "+ answer);

    }

  }
  public void teach( ){
    System.out.println("enter the name of student");
    String studentName=userinput.nextLine();

    Student student=new Student();
    student.learn(studentName);
  }
}
