package com.greenfoxacademy;

public class Student extends Person implements Cloneable {
  String previousOrganisazion;
  int skippedDays;


  public void getGoals(){
    System.out.println("Be a junior software developer.");
  }

  public void introduce(){
    System.out.println("Hi, I'm "+ name+ ",a "  +age + " year old " +  gender + " from " +previousOrganisazion + " who skipped "+ skippedDays+ " days from the course.");
  }

  public void skipDays( int numberOfDays){
    skippedDays+=numberOfDays;
  }

  public Student(){
    super();
    previousOrganisazion="The School of Life";
    skippedDays=0;
  }


  public Student clone(){
    return new Student(this.name,this.age,this.gender,previousOrganisazion);
  }

  public Student(String name,int age,String gender, String previousOrganisazion){
    super(name,age,gender);
    this.previousOrganisazion=previousOrganisazion;
  }
}





