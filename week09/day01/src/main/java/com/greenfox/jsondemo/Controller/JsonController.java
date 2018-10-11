package com.greenfox.jsondemo.Controller;

import com.greenfox.jsondemo.Services.JsonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class JsonController {

  JsonServices jsonServices;

  @Autowired
  public JsonController(JsonServices jsonServices) {
    this.jsonServices = jsonServices;
  }

  @GetMapping("/doubling")
  public String doubling(@RequestParam(value = "input", required =false) Integer input ){
    if (input==null) {
     return jsonServices.noInputGiven();
    } else return jsonServices.doubling();

  }

}
