package com.greenfoxacademy.springstart.controller;

import com.greenfoxacademy.springstart.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Arrays;
import java.util.List;

@Controller
public class BankAccountController {

  @GetMapping("/show")
  public String showBankAccount(Model model) {
    BankAccount bankAccount = new BankAccount("simba", 2000, "lion",true);
    model.addAttribute("bankAccountAttribute", bankAccount);

    System.out.println(bankAccount.getBalance());
    return "show-bankAccount";
  }

  @GetMapping("/enjoy")
  public String enjoyYourself(Model model) {
    String message = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    model.addAttribute("enjoyYourself", message);
    return "enjoyYourself";
  }

  @RequestMapping(value="/show/list",method = RequestMethod.GET)
  public String showListOfBankAccounts(Model model) {
    List<BankAccount> allBankAccounts;
    allBankAccounts = Arrays.asList(new BankAccount("simba", 4000, "lion",true),
            new BankAccount("nala", 600, "lion",false),
            new BankAccount("zazu", 1000, "bird",false),
            new BankAccount("banzai", 2300, "something",false));
    model.addAttribute("bankList", allBankAccounts);
    return "show-allBankAccounts";
  }
}
