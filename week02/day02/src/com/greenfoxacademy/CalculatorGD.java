package com.greenfoxacademy;

import java.util.Scanner;

public class CalculatorGD {
  public static void main(String... args) {
    // Create a simple calculator application which reads the parameters from the prompt
    // and prints the result to the prompt.
    // It should support the following operations,
    // create a method named "calculate()":
    // +, -, *, /, % and it should support two operands.
    // The format of the expressions must be: {operation} {operand} {operand}.
    // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

    // You can use the Scanner class
    // It should work like this:

    // Start the program
    // It prints: "Please type in the expression:"
    // Waits for the user input
    // Print the result to the prompt
    // Exit
    System.out.println("Please type in the expression. eg * 4 4");
    Scanner userinput = new Scanner(System.in);
    String expression = userinput.nextLine();

    System.out.println(calculate(expression));
  }


  public static int calculate(String input) {
    String[] expressionSplit = input.split(" ");
    Integer numSplit = Integer.parseInt(expressionSplit[1]);
    Integer numSplit2 = Integer.parseInt(expressionSplit[2]);
    int result=0;
    if ((expressionSplit[0].equals("+") || expressionSplit[0].equals("-") || expressionSplit[0].equals("*") || expressionSplit[0].equals("/") || expressionSplit[0].equals("%"))
            && (numSplit >= 0 || numSplit < 0)
            && (numSplit2 >= 0 || numSplit2 < 0)) {

    } else {
      System.out.println("Entered wrong format");
    }
    if (expressionSplit[0].equals("+")){
      result=numSplit + numSplit2;
    } else if(expressionSplit[0].equals("-")){
      result=numSplit-numSplit2;
    } else if(expressionSplit[0].equals("*")){
      result=numSplit*numSplit2;
    } else if(expressionSplit[0].equals("/")){
      result=numSplit/numSplit2;
    } else if(expressionSplit[0].equals("%")){
      result=numSplit%numSplit2;
    }
  return result;
  }
}