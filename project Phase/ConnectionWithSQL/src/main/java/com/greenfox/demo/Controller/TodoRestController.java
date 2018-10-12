package com.greenfox.demo.Controller;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class TodoRestController {
//
//  @GetMapping("/")
//  public String restContr(){
//    return "hiiii";
//  }

  @GetMapping("/")
  public String hello(@AuthenticationPrincipal final UserDetails userDetails) {

    String username = userDetails.getUsername();
    Collection<? extends GrantedAuthority> authorities = userDetails.getAuthorities();
    authorities
            .forEach(System.out::println);

    return "Hiiiiiii";
  }
}