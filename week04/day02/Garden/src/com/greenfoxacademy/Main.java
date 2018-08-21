package com.greenfoxacademy;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    // write your code here
    int waterToDistribute = 0;
    Garden garden = new Garden();
//    ArrayList<Plant> plants = new ArrayList<>();

    Flower flower1 = new Flower("Tulip", 4);
    garden.addFlower(flower1);

    Flower flower2 = new Flower("rose", 4);
    garden.addFlower(flower2);

    Tree tree1 = new Tree("Mango", 8);
    garden.addTree(tree1);
    Tree tree = new Tree("orange", 8);
    garden.addTree(tree);



    garden.statusOfPlants();
    System.out.println();

    waterToDistribute = 40;
    System.out.println("Watering with 40");
    garden.waterUsage();
    int plantNeedsWater = garden.countPlantsLessWater();
    garden.waterPlants(plantNeedsWater, waterToDistribute);
    garden.statusOfPlants();
    System.out.println();

    waterToDistribute = 70;
    System.out.println("Watering with 70");
    garden.waterUsage();
    plantNeedsWater = garden.countPlantsLessWater();
    garden.waterPlants(plantNeedsWater, waterToDistribute);
    garden.statusOfPlants();
  }
}
