package com.greenfoxacademy;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
      String[] trees1Character= new String[]{"Apple", "Fruit", "Green", "20", "Male"};
      String[] trees2Character= new String[]{"Guava", "Fruit", "Green", "20", "FeMale"};
      String[] trees3Character= new String[]{"rose", "flower", "black", "3 months", "FeMale"};
      String[] trees4Character= new String[]{"Grass", "grass", "yellow", "1 month", "Male"};
      String[] trees5Character= new String[]{"potato", "vegetable", "Green", "1 month", "Male"};
      ArrayList<String[]> listOfPlants=new ArrayList<>();

        listOfPlants.add(trees1Character);
      listOfPlants.add(trees2Character);
      listOfPlants.add(trees3Character);
      listOfPlants.add(trees4Character);
      listOfPlants.add(trees5Character);

      for (int i = 0; i <5 ; i++) System.out.println(listOfPlants.get(i))
              ;
    }
}
