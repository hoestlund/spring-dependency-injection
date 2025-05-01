package com.hostlund.dependency_injection.controllers;

import com.hostlund.dependency_injection.services.GreetingService;
import com.hostlund.dependency_injection.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

  private final GreetingService greetingService;

  public MyController() {
    this.greetingService = new GreetingServiceImpl();
  }

  public String sayGreeting(){
    return greetingService.sayGreeting();
  }

  public String sayHello(){
    System.out.println("Hello from the controller");
    return "Hello";
  }

}
