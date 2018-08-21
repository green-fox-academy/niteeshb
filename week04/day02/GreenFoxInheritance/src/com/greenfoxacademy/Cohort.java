package com.greenfoxacademy;

import java.util.ArrayList;

public class Cohort {
  /*Create a Cohort class that has the following

fields:
name: the name of the cohort
students: a list of Students
mentors: a list of Mentors
methods:
addStudent(Student): adds the given Student to students list
addMentor(Mentor): adds the given Mentor to mentors list
info(): prints out "The name cohort has students.size() students and mentors.size() mentors."
The Cohort class has the following constructors:

Cohort(name): beside the given parameter, it sets students and mentors as empty lists*/

  String nameOfCohort;
  ArrayList<String> students=new ArrayList<>();
  ArrayList<String> mentors=new ArrayList<>();

  public void addStudents(String student){
    students.add(student);
  }

  public void addMentor(String mentor){
    mentors.add(mentor);
  }

}
