package main.java.music;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

  @Test
  public void getApple() {
    Main main = new Main();
    assertEquals("apple", main.getApple());

  }
}