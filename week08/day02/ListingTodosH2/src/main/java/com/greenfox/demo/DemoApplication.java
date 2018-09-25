package com.greenfox.demo;

import com.greenfox.demo.Model.Todo;
import com.greenfox.demo.Repository.RepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

  private RepositoryInterface repositoryInterface;

  @Autowired
  public DemoApplication(RepositoryInterface repositoryInterface) {
    this.repositoryInterface = repositoryInterface;
  }

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
repositoryInterface.save(new Todo("I have to learn Object Relational Mapping"));
  }
}
