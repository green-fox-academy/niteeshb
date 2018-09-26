package com.greenfox.demo.Controller;

import com.greenfox.demo.Model.Todo;
import com.greenfox.demo.Repository.RepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

  @GetMapping("/todo")
  public String getPeople(@RequestParam(value = "done", required = false) String done, Model model) {
if (done!=null && done.equals("true") ) {
  boolean boolean2 = Boolean.parseBoolean("true");
  model.addAttribute("todoList", repositoryInterface.findAllByDoneIsTrue());
}else model.addAttribute("todoList", repositoryInterface.findAll());
      return "todoslist";

  }

@GetMapping("todo/add")
  public String showTodoAdd(){
    return "todoAdd";
}

  @PostMapping(value = "todo/save")
  public String SaveTodo(@ModelAttribute("newTodo") Todo newTodo, Model model) {
    repositoryInterface.save(newTodo);
    return "redirect:/todoslist";
  }
}
