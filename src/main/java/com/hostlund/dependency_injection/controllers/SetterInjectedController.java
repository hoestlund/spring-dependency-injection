package com.hostlund.dependency_injection.controllers;

import com.hostlund.dependency_injection.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {


  private GreetingService greetingService;

  @Autowired
  public void setGreetingService(GreetingService greetingService) {
    System.out.println("Setter is called");
    this.greetingService = greetingService;
  }

  public String sayGreeting(){
    return greetingService.sayGreeting();
  }
}
