package com.greenfoxacademy;



public class SubStrListHRD {
  public static void main(String[] args) {
    //  Create a function that takes a string and a list of string as a parameter
    //  Returns the index of the string in the list where the first string is part of
    //  Only need to find the first occurence and return the index of that
    //  Returns `-1` if the string is not part any of the strings in the list

    //  Example
//    String[] searchArr = new String[] {"this", "is", "what", "I'm", "searching"};
//    System.out.println(subStrList("ching", searchArr));
//      should print: `4`
//    System.out.println(subStrList("not", searchArr));
    //  should print: `-1`

    ArrayList<String> searchArr =new ArrayList<>(Arrays.asList("this", "is", "what", "I'm", "searching"));
    Scanner userinput=new Scanner(System.in);
    System.out.println("Enter the String you want to serach as Sub-String in List");
    String subString=userinput.nextLine();
    subInt(subString, searchArr);
  }

  public static void subInt(String subString, ArrayList<String> searchArr ){
    int result=0;

    for (int i=0;i<searchArr.size();i++){
     String listElement=searchArr.get(i);
      if (listElement.contains(subString)){
        System.out.println(subString + "is found in Element with index : "+ i);
        result=1;
    }
  }
  if (result==0){
    System.out.println("sub string not found");
  }
}
}