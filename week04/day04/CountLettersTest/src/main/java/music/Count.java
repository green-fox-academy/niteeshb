package main.java.music;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Count {


  public HashMap countAlphabets(String string) {
    HashMap dict = new HashMap();
    ArrayList<String> stringIntoArray = new ArrayList<>(Arrays.asList(string.split("")));
    for (int i = 0; i < stringIntoArray.size(); i++) {
      int counter = 1;
      for (int j = stringIntoArray.size()-1; j > i; j--) {
        if (stringIntoArray.get(i).equals(stringIntoArray.get(j))) {
          counter++;
          stringIntoArray.remove(j);
        }
      }
      dict.put(stringIntoArray.get(i), counter);
    }
return dict;
  }
}
