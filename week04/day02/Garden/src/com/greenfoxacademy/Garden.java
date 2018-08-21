package com.greenfoxacademy;

import java.util.ArrayList;
import java.util.Random;

public class Garden {
  String name;
  ArrayList<Flower> flower1=new ArrayList<>();
  ArrayList<Tree> tree1=new ArrayList<>();



  public void addFlower(Flower flower) {
    flower1.add(flower);
  }


  public void addTree(Tree tree) {
    tree1.add(tree);
  }

  public int countPlantsLessWater() {
    int count = 0;
    for (int i = 0; i < flower1.size(); i++) {
      if (flower1.get(i).water < 5) {
        count++;
      }
    }
    for (int i = 0; i < tree1.size(); i++) {
      if (tree1.get(i).water < 10) {
        count++;
      }
    }

    return count;
  }


  public void waterPlants(int plantNeedsWater, int waterToDistribute) {
    for (int i = 0; i < flower1.size(); i++) {
      if (flower1.get(i).water < 5) {
        flower1.get(i).water += (waterToDistribute / plantNeedsWater) * 0.75;
      }
    }
    for (int i = 0; i < tree1.size(); i++) {
      if (tree1.get(i).water < 10) {
        tree1.get(i).water += (waterToDistribute / plantNeedsWater) * 0.4;
      }
    }

  }

  public void waterUsage() {
    for (int i = 0; i < flower1.size(); i++) {

      flower1.get(i).water -= (Math.random() * 15);
    }
    for (int i = 0; i < tree1.size(); i++) {
      tree1.get(i).water -= (Math.random() * 15);
    }

  }

  public void statusOfPlants() {

    for (int i = 0; i < flower1.size(); i++) {
      if (flower1.get(i).water < 5) {
        System.out.println(flower1.get(i).name+ " needs water");
      } else System.out.println(flower1.get(i).name+ " doesnt needs water");

    }
    for (int i = 0; i < tree1.size(); i++) {
      if (tree1.get(i).water < 10) {
        System.out.println(tree1.get(i).name+ " needs water");
      } else System.out.println(tree1.get(i).name+ " doesnt needs water");

      }
    }
  }





