package com.hostlund.dependeny_injection.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

  public String sayHello(){
    System.out.println("Hello from the controller");
    return "Hello";
  }

}
