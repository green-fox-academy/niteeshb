//package com.greenfoxacademy;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class JosephusProblem {
//  public static void main(String[] args) {
//
//    Scanner userinput = new Scanner(System.in);
//    System.out.println("Enter the number of Players to solve Josephus Problem ");
//    int noOfPlayers=userinput.nextInt();
//    ArrayList<Integer> nameofPlayers= new ArrayList<>();
//
//    for (int i=0;i<noOfPlayers;i++){
//      nameofPlayers.add((i+1));
//    }
//    int noOfDeadPlayers=0;
//    int count=0;
//    int noOfplayerConstant=noOfPlayers;
//    while (noOfPlayers>=1){
//
//      for (int turnofplayer = 0; turnofplayer < nameofPlayers.size() ; turnofplayer += 2) {
//
//        if (((turnofplayer + 1) < nameofPlayers.size()) && noOfPlayers>=1) {
//          nameofPlayers.set(turnofplayer+1,0);
//          noOfDeadPlayers++;
//
//          if (noOfDeadPlayers<=noOfplayerConstant-1){
//
//          }else break;
//
//        }
//        else if((turnofplayer+1)== noOfPlayers){
//            nameofPlayers.set(0,0);
//            noOfDeadPlayers++;
//            count=count +1;
//          if (noOfDeadPlayers==noOfplayerConstant-1){
//            break;
//          }
//        }
//
//      }
//      System.out.println(nameofPlayers);
//      for (int j=noOfPlayers-1; j>=0; j--) {
//        if (nameofPlayers.get(j)==0){
//          nameofPlayers.remove(j);
//        }
//        System.out.println(nameofPlayers);
//      }
//      noOfPlayers=noOfPlayers-noOfDeadPlayers;
//
//      }
//    System.out.println(nameofPlayers);
//  }
//}
//

package com.greenfoxacademy;

import java.util.ArrayList;
import java.util.Scanner;

public class JosephusProblem {
  public static void main(String[] args) {

    Scanner userinput = new Scanner(System.in);
    System.out.println("Enter the number of Players to solve Josephus Problem ");
    int noOfPlayers=userinput.nextInt();
    ArrayList<Integer> nameofPlayers= new ArrayList<>();

    for (int i=0;i<noOfPlayers;i++){
      nameofPlayers.add((i+1));
    }
    int noOfDeadPlayers=0;
    int count=0;
    int noOfplayerConstant=noOfPlayers;
    while (noOfPlayers>=1){

      for (int turnofplayer = 0; turnofplayer < nameofPlayers.size() ; turnofplayer += 2) {

        if (((turnofplayer + 1) < nameofPlayers.size()) && noOfPlayers>=1) {
          nameofPlayers.set(turnofplayer+1,0);
//          noOfDeadPlayers++;

//          if (noOfDeadPlayers<=noOfplayerConstant-1){
//
//          }else break;

        }
        else if((turnofplayer+1)== nameofPlayers.size()){
          nameofPlayers.set(0,0);
//          noOfDeadPlayers++;
//          count=count +1;
//          if (noOfDeadPlayers==noOfplayerConstant-1){
//            break;
//          }
        }

      }
      System.out.println(nameofPlayers);
      for (int j=noOfPlayers-1; j>=0; j--) {
        if (nameofPlayers.get(j)==0){
          nameofPlayers.remove(j);
        }
        System.out.println(nameofPlayers);
      }
//      noOfPlayers=noOfPlayers-noOfDeadPlayers;

    }
    System.out.println(nameofPlayers);
  }
}

