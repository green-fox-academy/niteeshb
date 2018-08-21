package com.greenfoxacademy;

public class Student extends Person {
//  Create a Student class that has the same fields and methods as the Person class, and has the following additional
//
//  fields:
//  previousOrganization: the name of the student’s previous company / school
//  skippedDays: the number of days skipped from the course
//  methods:
//  getGoal(): prints out "Be a junior software developer."
//  introduce(): "Hi, I'm name, a age year old gender from previousOrganization who skipped skippedDays days from the course already."
//  skipDays(numberOfDays): increases skippedDays by numberOfDays
//  The Student class has the following constructors:
//
//  Student(name, age, gender, previousOrganization): beside the given parameters, it sets skippedDays to 0
//  Student(): sets name to Jane Doe, age to 30, gender to female, previousOrganization to The School of Life, skippedDays to 0
  String previousOrganisazion;
 int skippedDays;

 public void getGoals(){
   System.out.println("Be a junior software developer.");
 }

 public void introduce(){
   System.out.println("Hi, I'm"+ name+ ",a "  +age + " year old " +  gender + "from " +previousOrganisazion + "who skipped "+ skippedDays+ " days from the course.");
 }

 public void skipDays( int numberOfDays){
   skippedDays+=numberOfDays;
 }

 public Student(){
   super();
   previousOrganisazion="The School of Life";
   skippedDays=0;
 }

 public Student(String name,int age,String gender, String previousOrganisazion){
   super(name,age,gender);
   this.previousOrganisazion=previousOrganisazion;
 }
}
