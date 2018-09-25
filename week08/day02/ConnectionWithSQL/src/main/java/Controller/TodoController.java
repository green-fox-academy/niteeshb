package Controller;

import Repository.RepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
