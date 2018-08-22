package main.java.music;

public class BassGuitar extends StringedInstrument {


  public BassGuitar() {
    this.numberOfStrings = 4;
    this.name = "BassGuitar";
  }

  public BassGuitar(int noofstring) {
    this.numberOfStrings = noofstring;
    this.name = "BassGuitar";
  }

  @Override
  public String sound() {
    return "Duum-duum-duum";
  }
}
