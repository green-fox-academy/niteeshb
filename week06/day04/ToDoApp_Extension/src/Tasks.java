import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Tasks {
  private String task;
  private int id;
  private Date createdAt;
  private Date completedAt;
  static Path filePath = Paths.get("C:\\Users\\SwapNit\\greenfox\\niteeshb\\week06\\day04\\ToDoApp_Extension\\Tasks.txt");

  public void welcome() {
    System.out.println("Command line arguments:");
    System.out.println("-l   Lists all the tasks");
    System.out.println("-a   Adds a new task");
    System.out.println("-r   Removes an task");
    System.out.println("-c   Completes an task");
  }


  public void listsAllTheTasks() {
    try {
      List<String> lines = Files.readAllLines(filePath);

        for (int i=0;i<lines.size();i++) {
          if(lines.get(i).length()>1) {
            System.out.println(lines.get(i));
          }


          }
        }

       catch(Exception e){
        e.printStackTrace();
      }

  }


  public void addsNewTasks(String arg) {

    List<String> newTask = new ArrayList<>();
    Date date= new Date();
    List<String> previousTasks = new ArrayList<>();
    try {
      previousTasks = Files.readAllLines(filePath);
      newTask.add(previousTasks.size() + 1 + " - " + "[" + " " + "] " + arg +", created at : " + date.toString());
      Files.write(filePath, newTask, StandardOpenOption.APPEND);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Unable to add: no task provided");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void removesTask(int arg) {
    try {
      List<String> lines = Files.readAllLines(filePath);
      if (arg > lines.size()) {
        System.out.println("Unable to remove: index is out of bound");
      } else {
        String temp=lines.get(arg).charAt(0)+"";
        lines.add(arg,temp);
        lines.remove(arg + 1);

        Files.write(filePath, lines);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }


  public void completesTasks(int arg) {
    try {
      List<String> lines = Files.readAllLines(filePath);
      if (arg -1 > lines.size()) {
        System.out.println("the task given doesnt exists");
      } else {
        String temp = lines.get(arg-1).substring(0, 5) + "X" + lines.get(arg-1).substring(6, (lines.get(arg-1).length() - 1));
        lines.add(arg-1, temp);
        lines.remove(arg );
      }
      Files.write(filePath, lines);

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
