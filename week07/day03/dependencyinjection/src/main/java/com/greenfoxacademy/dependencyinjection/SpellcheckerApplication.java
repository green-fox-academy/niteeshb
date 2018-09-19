package com.greenfoxacademy.dependencyinjection;

import com.greenfoxacademy.dependencyinjection.service.SpellChecker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpellcheckerApplication implements CommandLineRunner {
//  @Autowired
  SpellChecker checker=new SpellChecker();

  public static void main(String[] args) {
    SpringApplication.run(SpellcheckerApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    checker.checkSpelling();
  }
}