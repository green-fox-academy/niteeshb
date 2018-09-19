package com.greenfoxacademy.exercise1;

import com.greenfoxacademy.exercise1.service.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Exercise1Application implements CommandLineRunner {
private Printer printer;

@Autowired
  public Exercise1Application(Printer printer) {
  this.printer=printer;
  }

  public static void main(String[] args) {
    SpringApplication.run(Exercise1Application.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    printer.log("hello niteesh");
  }
}
