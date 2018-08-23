package main.java.music;

import org.junit.Assert;

import static org.junit.Assert.*;

public class AnagramTest {

  @org.junit.Test
  public void check() {

    Anagram check=new Anagram();
    String s1="check";
    String s2="kcehc";
    Assert.assertEquals(true,check.check(s1,s2));
  }
}