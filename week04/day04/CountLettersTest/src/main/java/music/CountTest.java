package main.java.music;

import java.util.HashMap;

import static org.junit.Assert.*;

public class CountTest {

  @org.junit.Test
  public void countAlphabets() {
String s="ddds";
    HashMap hashMap=new HashMap();

    hashMap.put("s",1);
    hashMap.put("d",3);
    Count count=new Count();
assertEquals(hashMap,count.countAlphabets(s));
    assertEquals(1,(count.countAlphabets(s)).get("s"));
  }
}