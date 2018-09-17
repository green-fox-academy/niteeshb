package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {
  AtomicLong counter = new AtomicLong(1);

  @RequestMapping(value = "/greeting")
  public Greetings greeting(@RequestParam(value="name") String string) {

    return new Greetings( counter.getAndIncrement(),"hi " + string);
  }


}
