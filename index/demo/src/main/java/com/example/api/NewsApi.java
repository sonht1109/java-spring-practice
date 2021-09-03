package com.example.api;

import com.example.dto.NewDTO;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//RestController = Controller + ResponseBody
public class NewsApi {

  @PostMapping(value = "/news")
  //@ResponseBody => parse data from client to json
  public NewDTO createNews(@RequestBody NewDTO news) {
    return news;
  }
}
