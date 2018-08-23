package main.java.music;

import java.util.Scanner;

public class Anagram {


  public boolean check(String string1, String string2) {
    String checkanagram="";

    for (int i=string1.length()-1;i>=0;i--){
      checkanagram=checkanagram+string1.charAt(i);
    }
    if (checkanagram.equals(string2)){
      return true;
    }else return  false;

  }
}
