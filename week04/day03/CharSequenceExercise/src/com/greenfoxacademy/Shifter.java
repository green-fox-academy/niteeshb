package com.greenfoxacademy;

public class Shifter implements CharSequence {

  String string="";
  @Override
  public int length() {
    return 0;
  }

  @Override
  public char charAt(int index) {

    char c = string.charAt(index);
    return c;
  }
    public CharSequence subSequence(int start, int end) {


    return null;
  }

  public Shifter(String string,int t) {
    this.string = string.substring(t);
  }
}
