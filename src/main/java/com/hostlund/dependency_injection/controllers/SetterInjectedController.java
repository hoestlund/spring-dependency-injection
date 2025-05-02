package com.hostlund.dependency_injection.controllers;

import com.hostlund.dependency_injection.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

  //If we have the autowired here we need to have the qualifier here too.
  //It is also more readible to have the annotations here and not in the setter
  private GreetingService greetingService;

  //@Qualifier("setterGreetingBean")
  @Autowired
  public void setGreetingService(@Qualifier("setterGreetingBean") GreetingService greetingService) {
    System.out.println("Setter is called");
    this.greetingService = greetingService;
  }

  public String sayGreeting() {
    return greetingService.sayGreeting();
  }
}
