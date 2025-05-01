package com.hostlund.dependency_injection.controllers;

import com.hostlund.dependency_injection.services.GreetingService;

public class PropertyInjectedController {

  GreetingService greetingService;

  public String sayGreeting(){
    return greetingService.sayGreeting();
  }

}
