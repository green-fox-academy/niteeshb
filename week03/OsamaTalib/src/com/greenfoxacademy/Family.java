package com.greenfoxacademy;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Family {

  String name;


  String Check_if_this_person_is_a_member(String name) {
    ArrayList<ArrayList<String>> theBigFamily = new ArrayList<>();
    ArrayList<String> familyMember1 = new ArrayList<>(Arrays.asList("Talib", "Nedal", "Osama", "Hayder", "Maha", "Hind"));
    ArrayList<String> familyMember2 = new ArrayList<>(Arrays.asList("Jafer", "Ibtesam", "Amar", "Homam", "Hadeer"));
    theBigFamily.add(familyMember1);
    theBigFamily.add(familyMember2);

    String resulte = "ooo";

    for (int i = 0; i < theBigFamily.size(); i++) {
      for (int j = 0; j < theBigFamily.get(i).size(); j++) {
        if (name.equals(theBigFamily.get(i).get(j))) {
          resulte = name;

        }

      }

    }

    return resulte;
  }
}
