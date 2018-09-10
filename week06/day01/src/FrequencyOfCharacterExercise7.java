import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FrequencyOfCharacterExercise7 {
  public static void main(String[] args) {
//    Write a Stream Expression to find the frequency of characters in a given string!

    String string = "My Name Is NiTeEsh";
    List<String> charList = Arrays.asList(string.split(""));
    System.out.println(charList.stream()
            .filter(s->!(s.equals(" ")))
        .collect(Collectors.groupingBy((s->s),Collectors.counting())));

  }
}
