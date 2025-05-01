package com.hostlund.dependency_injection.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class GreetingServicePrimary implements GreetingService{

  @Override
  public String sayGreeting() {
    return "Hello for the primary Bean";
  }
}
