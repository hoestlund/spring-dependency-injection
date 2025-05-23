package com.hostlund.dependency_injection.controllers;

import com.hostlund.dependency_injection.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

  public ConstructorInjectedController(@Qualifier("greetingServiceImpl") GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  private final GreetingService greetingService;

  public String sayGreeting(){
    return greetingService.sayGreeting();
  }
}
