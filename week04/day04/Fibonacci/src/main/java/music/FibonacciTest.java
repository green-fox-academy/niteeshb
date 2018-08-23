package main.java.music;

import static org.junit.Assert.*;

public class FibonacciTest {

  @org.junit.Test
  public void main() {
    Fibonacci fibonacci=new Fibonacci();
    assertEquals(13,fibonacci.findFibonacchi(7));
  }
}