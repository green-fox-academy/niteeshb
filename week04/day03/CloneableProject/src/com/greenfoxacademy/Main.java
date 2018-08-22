package com.greenfoxacademy;

public class Main {

  public static void main(String[] args) {
    // write your code here
    Student student = new Student("John", 20, "Male", "BME");
    Student student2 = student.clone();

    System.out.println(student2.name);
    System.out.println(student.name);
  }
}
