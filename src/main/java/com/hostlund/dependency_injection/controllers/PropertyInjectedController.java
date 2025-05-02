package com.hostlund.dependency_injection.controllers;

import com.hostlund.dependency_injection.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

  @Qualifier("propertyGreetingService")
  @Autowired
  GreetingService greetingService;

  public String sayGreeting(){
    return greetingService.sayGreeting();
  }

}
