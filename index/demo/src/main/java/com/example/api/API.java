package com.example.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class API {
  @GetMapping("/demo")
  public String demoAPI() {
    return "Success";
  }
}
