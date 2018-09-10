import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CharArrayToStringExercise9 {
  public static void main(String[] args) {
//    Write a Stream Expression to convert a char array to a string!
    char[] chararray={'a','b','c','d'};
    List charList = Arrays.asList(chararray);

    Stream.of(chararray)

            .forEach(s-> {
              System.out.println(s);
            });

    String concatenated = new String(chararray);

    concatenated.chars()
            .

  }
}
