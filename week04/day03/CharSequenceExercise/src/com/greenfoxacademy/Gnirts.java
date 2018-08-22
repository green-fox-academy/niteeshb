package com.greenfoxacademy;

public class Gnirts implements CharSequence,Cloneable {

  String string;
  @Override
  public int length() {
    return 0;
  }

  @Override
  public char charAt(int index) {

char c=string.charAt(string.length()-index);
    return c;
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }

  public Gnirts(String string) {
    this.string=string;
  }
}
