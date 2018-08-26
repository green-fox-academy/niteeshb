package main.java.music;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

  public boolean checkAnagram(String string1, String string2) {
    ArrayList<String> string1List =
            new ArrayList<>(Arrays.asList(string1.split("")));
    ArrayList<String> string2List =
            new ArrayList<>(Arrays.asList(string2.split("")));
    if (string1List.size() == string2List.size()) {
      for (int i = 0; i < string1List.size(); i++) {
        if (string2List.contains(string1List.get(i))) {
          string2List.remove(string2List.indexOf(string1List.get(i)));
        } else return false;
      }
    } else {
      return false;
    }
    return true;
  }


  public ArrayList findAnagrams(String string1) {

    ArrayList<String> anagramList = new ArrayList<>();
    //2 for loops are for finding the total no of anagrams of word
    for (int i = 0; i < string1.length(); i++) {

      for (int j = i; j < string1.length(); ) {
        String temp = "";
        ArrayList<String> string1List =
                new ArrayList<>(Arrays.asList(string1.split("")));
        //for finding 1 anagram
        for (int k = 0; k < string1List.size(); ) {
          int rand = (int) (Math.random() * string1List.size());
          temp += string1List.get(rand);
          string1List.remove(rand);
        }
        if (anagramList.contains(temp)) {

        } else {
          anagramList.add(temp);
          j++;
        }
      }

    }

    return anagramList;
  }
}
