package com.greenfoxacademy;

import java.util.Scanner;

public class Student {
String teacher;
String studentName;

  public void question(){

    System.out.println("ask question");
    Scanner userinput=new Scanner(System.in);
    String question=userinput.nextLine();
    System.out.println("enter teacher name to ask question");
    String teacherName=userinput.nextLine();

    Teacher teacher= new Teacher();
    teacher.answer(question,teacherName);


  }

  public void learn(String studentName) {
    if (this.studentName.equals(studentName)){
      System.out.println("student learned the concept");
    }
  }
}
