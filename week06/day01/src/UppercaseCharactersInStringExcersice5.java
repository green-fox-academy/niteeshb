public class UppercaseCharactersInStringExcersice5 {
  public static void main(String[] args) {
//    Write a Stream Expression to find the uppercase characters in a string!

    String string = "My Name Is NiTeEsh";
    string.chars()
            .filter(s -> (s >= 'A' && s <= 'Z'))
            .mapToObj(s -> Character.toString((char) s))
            .forEach(System.out::println);
  }
}
