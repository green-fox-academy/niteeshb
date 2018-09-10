import java.util.ArrayList;
import java.util.Arrays;

public class AverageOfOddNumbers {
  public static void main(String[] args) {
//  Write a Stream Expression to get the average value of the odd numbers from the following array:

    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));
  double average=numbers.stream()
          .filter(s->s%2!=0)
          .mapToInt(s->s)
          .average()
          .getAsDouble();
    System.out.println((average));
  }
}
