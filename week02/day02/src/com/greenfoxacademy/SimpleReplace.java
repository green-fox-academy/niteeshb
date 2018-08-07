public class SimpleReplace {
  public static void main(String... args){
    String striing = "In a dishwasher far far away";

    String newExample=striing.replace("dishwasher","teapot");

    // I would like to replace "dishwasher" with "galaxy" in this example, but it has a problem.
    // Please fix it for me!
    // Expected ouput: In a galaxy far far away

    System.out.println(newExample);
  }
}