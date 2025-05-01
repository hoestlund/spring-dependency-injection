package com.hostlund.dependency_injection.controllers;

import com.hostlund.dependency_injection.services.GreetingService;

public class SetterInjectedController {

  private GreetingService greetingService;

  public void setGreetingService(GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  public String sayGreeting(){
    return greetingService.sayGreeting();
  }
}
