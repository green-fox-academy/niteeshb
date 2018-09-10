package com.greenfoxacademy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Logs {
  public static void main(String[] args) {
    // Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP adresses.
// Write a function that returns the GET / POST request ratio.
    Path filePath = Paths.get("log.txt");
    String message = "Mon Feb  5 10:47:12 2018   32.28.73.45   POST /";




    try {
      ArrayList<String> ipAddress = (ArrayList<String>) Files.readAllLines(filePath);
      int inde = ipAddress.get(0).indexOf("32");
      int inde1 = ipAddress.get(0).indexOf("\\d{2}\\.\\d{2}\\.\\d{2}\\.\\d{2}");

      Pattern pattern = Pattern.compile("\\d{2}\\.\\d{2}\\.\\d{2}\\.\\d{2}");
      Matcher matcher = pattern.matcher(message);

      while (matcher.find()) {
        System.out.println(matcher.group());
      }

      System.out.println(inde+ "  "+ inde1);
      ArrayList<String> newIpAddress = new ArrayList<>();
      for (int i = 0; i < ipAddress.size(); i++) {
        newIpAddress.add(ipAddress.get(i).substring(inde, inde + 11));
//        System.out.println(newIpAddress.get(i));
      }
      ArrayList listAfterFunct = (logFunction(newIpAddress));
      Collections.sort(newIpAddress);
      System.out.println(newIpAddress);
    } catch (IOException e) {
      e.printStackTrace();
    }

  }

  private static ArrayList<String> logFunction(ArrayList<String> ipAddress) {
    for (int i = 0; i < ipAddress.size(); i++) {
      for (int j = ipAddress.size() - 1; j > i; j--) {
        if ((ipAddress.get(j)).equals(ipAddress.get(i))) {
          ipAddress.remove(j);
        }
      }
    }

    return ipAddress;
  }
}
