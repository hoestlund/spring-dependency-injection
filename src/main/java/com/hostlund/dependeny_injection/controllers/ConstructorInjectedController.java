package com.hostlund.dependeny_injection.controllers;

import com.hostlund.dependeny_injection.services.GreetingService;

public class ConstructorInjectedController {

  public ConstructorInjectedController(GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  private final GreetingService greetingService;

  public String sayGreeting(){
    return greetingService.sayGreeting();
  }
}
