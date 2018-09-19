package greenfox.exercise2;

import greenfox.exercise2.service.MyColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Exercise2Application implements CommandLineRunner {
MyColor myColor;

@Autowired
  public Exercise2Application(MyColor myColor) {
    this.myColor = myColor;
  }

  public static void main(String[] args) {
    SpringApplication.run(Exercise2Application.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    myColor.printColor();
  }
}
