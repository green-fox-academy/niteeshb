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
   Tasks tasks=new Tasks();
    if (args.length == 0) {
      tasks.welcome();

    } else if (args[0].equals("-l") || args[0].equals("-a") || args[0].equals("-r") || args[0].equals("-c")) {
      if (args[0].equals("-l")) {
        tasks.listsAllTheTasks();

      } else if (args[0].equals("-a")) {
        if (args.length == 1) {
          System.out.println("Unable to add: no task provided");
        } else tasks.addsNewTasks( args[1]);

      } else if (args[0].equals("-r")) {
        if (args.length == 1) {
          System.out.println("Unable to remove: no index provided");
        } else {
          try {
            int value = Integer.parseInt(args[1]);
            tasks.removesTask( value);
          } catch (Exception e) {
            System.out.println("Unable to remove: index is not a number");
          }
        }
      } else if (args[0].equals("-c")) {
        if (args.length == 1) {
          System.out.println("Unable to complete: no task provided");
        } else {
          try {
            int value = Integer.parseInt(args[1]);
            tasks.completesTasks(value);
          } catch (Exception e) {
            System.out.println("Unable to remove: index is not a number");
          }
        }
      }
    } else
      System.out.println("Unsupported argument");
  }

}

