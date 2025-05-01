package com.hostlund.dependeny_injection.controllers;

import com.hostlund.dependeny_injection.services.GreetingService;

public class SetterInjectedController {

  private GreetingService greetingService;

  public void setGreetingService(GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  public String sayGreeting(){
    return greetingService.sayGreeting();
  }
}
