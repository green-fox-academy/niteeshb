import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


  public static void main(String[] args) throws IOException {
    // write your code here
    Path filePath = Paths.get("C:\\Users\\SwapNit\\greenfox\\niteeshb\\week06\\day04\\ToDoApp_Extension\\Tasks.txt");
    if (args.length == 0) {
      welcome();

    } else if (args[0].equals("-l") || args[0].equals("-a") || args[0].equals("-r") || args[0].equals("-c")) {
      if (args[0].equals("-l")) {
        listsAllTheTasks(filePath);

      } else if (args[0].equals("-a")) {
        if (args.length == 1) {
          System.out.println("Unable to add: no task provided");
        } else addsNewTasks(filePath, args[1]);

      } else if (args[0].equals("-r")) {
        if (args.length == 1) {
          System.out.println("Unable to remove: no index provided");
        } else {
          try {
            int value = Integer.parseInt(args[1]);
            removesTask(filePath, value);
          } catch (Exception e) {
            System.out.println("Unable to remove: index is not a number");
          }
        }
      } else if (args[0].equals("-c")) {
        completesTasks();
      }
    } else
      System.out.println("Unsupported argument");
  }


  public static void welcome() {
    System.out.println("Command line arguments:");
    System.out.println("-l   Lists all the tasks");
    System.out.println("-a   Adds a new task");
    System.out.println("-r   Removes an task");
    System.out.println("-c   Completes an task");
  }


  private static void listsAllTheTasks(Path filePath) {
    try {
      List<String> lines = Files.readAllLines(filePath);
      if (lines.size() == 0) {
        System.out.println("No todos for today! :)");
      } else {
        for (String s : lines) {
          System.out.println(s);
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

  }

  private static void addsNewTasks(Path filePath, String arg) {

    List<String> newTask = new ArrayList<>();
    List<String> previousTasks = new ArrayList<>();
    try {
      previousTasks = Files.readAllLines(filePath);
      newTask.add(previousTasks.size() + 1 + " - " + "[" + " " + "] " + arg);
      Files.write(filePath, newTask, StandardOpenOption.APPEND);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Unable to add: no task provided");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }


  private static void removesTask(Path filePath, int arg) {
    try {
      List<String> lines = Files.readAllLines(filePath);
      List<String> newLines=new ArrayList<>();
      if (arg > lines.size()) {
        System.out.println("Unable to remove: index is out of bound");
      } else {
        lines.remove(arg - 1);
        for (int i=0;i<lines.size();i++) {
          String temp = i + 1 + "" + lines.get(i).substring(1);
          newLines.add(temp);
        }
        Files.write(filePath, newLines);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private static void completesTasks() {

  }
}

