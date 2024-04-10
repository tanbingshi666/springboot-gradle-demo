package com.example.controller;

import com.example.bean.Demo;
import com.example.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController {

  @Autowired
  private DemoService demoService;

  @GetMapping("/demo/{id}")
  public Demo getDemo(@PathVariable Integer id) {
    return demoService.getDemo(id);
  }
}
