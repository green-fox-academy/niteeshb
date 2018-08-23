package main.java.music;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {


  public boolean checkAnagram(String string1, String string2) {
    ArrayList<String> string1List= new ArrayList<>(Arrays.asList(string1.split("")));
    ArrayList<String> string2List= new ArrayList<>(Arrays.asList(string2.split("")));
    if (string1List.size()==string2List.size()){
      for (int i=0;i<string1List.size();i++){
        if (string2List.contains(string1List.get(i))){
          string2List.remove(string2List.indexOf(string1List.get(i)));
        }else return false;
      }
    }else {
      return false;
    }
return true;
  }
}
