package com.hostlund.dependency_injection.services;

public class GreetingServiceImpl implements GreetingService {

  @Override
  public String sayGreeting() {
    return "Howdy";
  }
}
