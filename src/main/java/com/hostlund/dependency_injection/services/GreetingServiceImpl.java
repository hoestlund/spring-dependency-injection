package com.hostlund.dependency_injection.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

  @Override
  public String sayGreeting() {
    return "Howdy";
  }
}
