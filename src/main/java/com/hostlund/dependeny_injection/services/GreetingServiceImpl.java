package com.hostlund.dependeny_injection.services;

public class GreetingServiceImpl implements GreetingService {

  @Override
  public String sayGreeting() {
    return "Howdy";
  }
}
