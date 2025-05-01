package com.hostlund.dependeny_injection.controllers;

import com.hostlund.dependeny_injection.services.GreetingService;

public class PropertyInjectedController {

  GreetingService greetingService;

  public String sayGreeting(){
    return greetingService.sayGreeting();
  }

}
