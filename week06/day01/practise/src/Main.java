import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	// write your code here
      Integer[] arra = {1, 2, 3,2,3,4,2};
      long c = Arrays.stream(arra).filter(p -> p % 2==0)
              .count();
//      System.out.println(c);
      List<Integer> lista=Arrays.asList(arra);
              lista.stream().map(p->p*(p-1))
//              .filter(p-> p%2==0).collect(Collectors.toList())
              .forEach(System.out::println);

      List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
      List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());

      List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

//get list of unique squares
      List<Integer> squaresList = numbers.stream().map( i -> i*i).collect(Collectors.toList());
      System.out.println(squaresList);
    }
}
