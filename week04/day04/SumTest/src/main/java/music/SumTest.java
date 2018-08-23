package main.java.music;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SumTest {

  @Test
  public void testSum(){

    ArrayList<Integer> integer = new ArrayList<>();
    integer.add(2);
    integer.add(1);
    integer.add(4);
    integer.add(5);
    integer.add(8);
    integer.add(2);

    Main main=new Main();
    Assert.assertEquals(22, main.sum(integer));
  }

  @Test
  public void testSumEmptyList(){

    ArrayList<Integer> integer = new ArrayList<>();

    Main main=new Main();
    Assert.assertEquals(0, main.sum(integer));
  }

  @Test
  public void testSum1Element(){

    ArrayList<Integer> integer = new ArrayList<>();
    integer.add(2);

    Main main=new Main();
    Assert.assertEquals(2, main.sum(integer));
  }
  @Test
  public void testSumNullList(){

    ArrayList<Integer> integer=new ArrayList<>() ;
    Main main=new Main();
    Assert.assertEquals(0, main.sum(integer));
  }


}