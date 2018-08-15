import java.util.Arrays;
import java.util.List;

public class Domino {
  private final int[] values;

  public Domino(int valueA, int valueB) {
    this.values = new int[]{valueA, valueB};
  }

  public int[] getValues() {
    return values;
  }

  @Override
  public String toString() {
    return "[" + values[0] + ", " + values[1] + "]";
  }

  static void sortDomino(List<Domino> dominoes) {
    int j = 1;

    for (int i = 0; i < dominoes.size() - 1; i++)
      for (int k = i + 1; k < dominoes.size(); k++) {
        if ((dominoes.get(i).getValues()[1]) == (dominoes.get(k).getValues()[0])) {

          dominoes.add(i + 1, dominoes.get(k));
          dominoes.remove(k + 1);
          //System.out.println(dominoes.get(i).getValues());
          break;
        }
        ;

      }
  }
}