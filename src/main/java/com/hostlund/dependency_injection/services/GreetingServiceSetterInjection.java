package com.hostlund.dependency_injection.services;

import org.springframework.stereotype.Service;

@Service("setterGreetingBean")
public class GreetingServiceSetterInjection implements GreetingService {


  @Override
  public String sayGreeting() {
    return "I'm setting a greeting";
  }
}
