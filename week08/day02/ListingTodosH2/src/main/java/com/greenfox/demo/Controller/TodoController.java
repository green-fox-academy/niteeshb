package com.greenfox.demo.Controller;

import com.greenfox.demo.Repository.RepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TodoController {

  private RepositoryInterface repositoryInterface;

  public TodoController() {
  }

  @Autowired
  public TodoController(RepositoryInterface repositoryInterface) {
    this.repositoryInterface = repositoryInterface;
  }

  @GetMapping(value = {"/", "/list"})
  public String list(Model model) {

    return "todoslist";
  }

  @GetMapping("/todos")
  public String getPeople(Model model) {
model.addAttribute("todoList",repositoryInterface.findAll());
      return "todoslist";

  }


}
