package com.hostlund.dependency_injection.controllers.i18n;

import com.hostlund.dependency_injection.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class Myi18NController {

  private final GreetingService greetingService;

  @Autowired
  public Myi18NController(@Qualifier("i18NService") GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  public String sayHello() {
    return greetingService.sayGreeting();
  }

}
