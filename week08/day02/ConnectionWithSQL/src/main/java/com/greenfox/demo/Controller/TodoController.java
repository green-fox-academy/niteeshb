package com.greenfox.demo.Controller;

import com.greenfox.demo.Model.Todo;
import com.greenfox.demo.Repository.RepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
  public String getPeople(@RequestParam(value = "done", required = false) String done, Model model) {
    if (done == null || done.equals("false")) {
      model.addAttribute("todoList", repositoryInterface.findAll());
    } else model.addAttribute("todoList", repositoryInterface.findAllByDoneIsTrue());
    return "todoslist";
  }

  @GetMapping("/add")
  public String addTodo(Model model) {
  model.addAttribute("todo",new Todo());
  return "todoAdd";
  }

  @PostMapping("/add")
  public String SaveTodo(@ModelAttribute Todo todo) {
    repositoryInterface.save(todo);
    return "redirect:";
  }

  @GetMapping("/{id}/delete")
  public String deleteTodo(@PathVariable ("id") long id){
    repositoryInterface.deleteById(id);
    return "redirect:/";
  }

  @GetMapping("/{id}/update")
  public String updateTodo(@PathVariable ("id") long id,Model model){
    model.addAttribute("todo",repositoryInterface.findById(id).get());
    return "editTodo";
  }

  @PostMapping("/{id}/update")
  public String saveUpdate(@ModelAttribute Todo todo){
    repositoryInterface.save(todo);
    return "redirect:/";
  }
}
