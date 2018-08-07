package com.greenfoxacademy;

public class UrlFixer {
  public static void main(String... args){
    StringBuilder url = new StringBuilder("https//www.reddit.com/r/nevertellmethebots");

    // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
    // Also, the URL is missing a crutial component, find out what it is and insert it too!
    // Try to solve it more than once using different String functions!
    int x=url.indexOf("bots");
    url.replace(x,x+4,"odds");

    System.out.println(url);
    url.insert(5, ':');
    System.out.println(url);
  }
}